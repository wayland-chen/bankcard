package com.offke.core.messages.json;

import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.*;

public class JsonObject {

    private static final class Null {

        @Override
        protected final Object clone() {
            return this;
        }

        @Override
        public boolean equals(Object object) {
            return object == null || object == this;
        }

        @Override
        public String toString() {
            return "null";
        }
    }

    private Map map;

    public static final Object NULL = new Null();

    public JsonObject() {
        this.map = new LinkedHashMap();
    }

    public JsonObject(JsonObject jo, String[] names) throws JsonException {
        this();
        for (int i = 0; i < names.length; i += 1) {
            putOnce(names[i], jo.opt(names[i]));
        }
    }

    public JsonObject(JsonTokener x) throws JsonException {
        this();
        char c;
        String key;

        if (x.nextClean() != '{') {
            throw x.syntaxError("A JSONObject text must begin with '{'");
        }
        for (; ; ) {
            c = x.nextClean();
            switch (c) {
                case 0:
                    throw x.syntaxError("A JSONObject text must end with '}'");
                case '}':
                    return;
                default:
                    x.back();
                    key = x.nextValue().toString();
            }

            /*
             * The key is followed by ':'. We will also tolerate '=' or '=>'.
             */

            c = x.nextClean();
            if (c == '=') {
                if (x.next() != '>') {
                    x.back();
                }
            } else if (c != ':') {
                throw x.syntaxError("Expected a ':' after a key");
            }
            putOnce(key, x.nextValue());

            /*
             * Pairs are separated by ','. We will also tolerate ';'.
             */

            switch (x.nextClean()) {
                case ';':
                case ',':
                    if (x.nextClean() == '}') {
                        return;
                    }
                    x.back();
                    break;
                case '}':
                    return;
                default:
                    throw x.syntaxError("Expected a ',' or '}'");
            }
        }
    }

    public JsonObject(Map map) {
        this.map = (map == null) ? new LinkedHashMap() : map;
    }

    public JsonObject(Map map, boolean includeSuperClass) {
        this.map = new LinkedHashMap();
        if (map != null) {
            for (Iterator i = map.entrySet().iterator(); i.hasNext(); ) {
                Map.Entry e = (Map.Entry) i.next();
                this.map.put(e.getKey(), new JsonObject(e.getValue(), includeSuperClass));
            }
        }
    }

    public JsonObject(Object bean) {
        this();
        populateInternalMap(bean, false);
    }

    public JsonObject(Object bean, boolean includeSuperClass) {
        this();
        populateInternalMap(bean, includeSuperClass);
    }

    private void populateInternalMap(Object bean, boolean includeSuperClass) {
        Class klass = bean.getClass();

        // If klass.getSuperClass is System class then includeSuperClass =
        // false;

        if (klass.getClassLoader() == null) {
            includeSuperClass = false;
        }

        Method[] methods = (includeSuperClass) ? klass.getMethods() : klass.getDeclaredMethods();
        for (int i = 0; i < methods.length; i += 1) {
            try {
                Method method = methods[i];
                String name = method.getName();
                String key = "";
                if (name.startsWith("get")) {
                    key = name.substring(3);
                } else if (name.startsWith("is")) {
                    key = name.substring(2);
                }
                if (key.length() > 0
                        && Character.isUpperCase(key.charAt(0))
                        && method.getParameterTypes().length == 0) {
                    if (key.length() == 1) {
                        key = key.toLowerCase();
                    } else if (!Character.isUpperCase(key.charAt(1))) {
                        key = key.substring(0, 1).toLowerCase() + key.substring(1);
                    }

                    Object result = method.invoke(bean, (Object[]) null);
                    if (result == null) {
                        map.put(key, NULL);
                    } else if (result instanceof Date) {
                        map.put(key, new SimpleDateFormat("yyyy/MM/dd").format(result));
                    } else if (result.getClass().isArray()) {
                        map.put(key, new JsonArray(result, includeSuperClass));
                    } else if (result instanceof Collection) { // List or Set
                        map.put(key, new JsonArray((Collection) result, includeSuperClass));
                    } else if (result instanceof Map) {
                        map.put(key, new JsonObject((Map) result, includeSuperClass));
                    } else if (isStandardProperty(result.getClass())) { // Primitives, String and Wrapper
                        map.put(key, result);
                    } else {
                        if (result.getClass().getPackage().getName().startsWith("java")
                                || result.getClass().getClassLoader() == null) {
                            map.put(key, result.toString());
                        } else { // User defined Objects
                            map.put(key, new JsonObject(result, includeSuperClass));
                        }
                    }
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    private boolean isStandardProperty(Class clazz) {
        return clazz.isPrimitive()
                || clazz.isAssignableFrom(Byte.class)
                || clazz.isAssignableFrom(Short.class)
                || clazz.isAssignableFrom(Integer.class)
                || clazz.isAssignableFrom(Long.class)
                || clazz.isAssignableFrom(Float.class)
                || clazz.isAssignableFrom(Double.class)
                || clazz.isAssignableFrom(Character.class)
                || clazz.isAssignableFrom(String.class)
                || clazz.isAssignableFrom(Boolean.class);
    }

    public JsonObject(Object object, String names[]) {
        this();
        Class c = object.getClass();
        for (int i = 0; i < names.length; i += 1) {
            String name = names[i];
            try {
                putOpt(name, c.getField(name).get(object));
            } catch (Exception e) {
                /* forget about it */
            }
        }
    }

    public JsonObject(String source) throws JsonException {
        this(new JsonTokener(source));
    }

    public JsonObject accumulate(String key, Object value) throws JsonException {
        testValidity(value);
        Object o = opt(key);
        if (o == null) {
            put(key, value instanceof JsonArray ? new JsonArray().put(value) : value);
        } else if (o instanceof JsonArray) {
            ((JsonArray) o).put(value);
        } else {
            put(key, new JsonArray().put(o).put(value));
        }
        return this;
    }

    public JsonObject append(String key, Object value) throws JsonException {
        testValidity(value);
        Object o = opt(key);
        if (o == null) {
            put(key, new JsonArray().put(value));
        } else if (o instanceof JsonArray) {
            put(key, ((JsonArray) o).put(value));
        } else {
            throw new JsonException("JSONObject[" + key + "] is not a JSONArray.");
        }
        return this;
    }

    static public String doubleToString(double d) {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            return "null";
        }

        // Shave off trailing zeros and decimal point, if possible.

        String s = Double.toString(d);
        if (s.indexOf('.') > 0 && s.indexOf('e') < 0 && s.indexOf('E') < 0) {
            while (s.endsWith("0")) {
                s = s.substring(0, s.length() - 1);
            }
            if (s.endsWith(".")) {
                s = s.substring(0, s.length() - 1);
            }
        }
        return s;
    }

    public Object get(String key) {
        Object o = opt(key);
        if (o == null) {
            return null;
        }
        return o;
    }

    public boolean getBoolean(String key) throws JsonException {
        Object o = get(key);
        if (o.equals(Boolean.FALSE) || (o instanceof String && ((String) o).equalsIgnoreCase("false"))) {
            return false;
        } else if (o.equals(Boolean.TRUE)
                || (o instanceof String && ((String) o).equalsIgnoreCase("true"))) {
            return true;
        }
        throw new JsonException("JSONObject[" + quote(key) + "] is not a Boolean.");
    }

    public double getDouble(String key) throws JsonException {
        Object o = get(key);
        try {
            return o instanceof Number ? ((Number) o).doubleValue() : Double
                    .valueOf((String) o)
                    .doubleValue();
        } catch (Exception e) {
            throw new JsonException("JSONObject[" + quote(key) + "] is not a number.");
        }
    }

    public int getInt(String key) throws JsonException {
        Object o = get(key);
        return o instanceof Number ? ((Number) o).intValue() : (int) getDouble(key);
    }

    public JsonArray getJSONArray(String key) throws JsonException {
        Object o = get(key);
        if (o instanceof JsonArray) {
            return (JsonArray) o;
        }
        throw new JsonException("JSONObject[" + quote(key) + "] is not a JSONArray.");
    }

    public JsonObject getJSONObject(String key) throws JsonException {
        Object o = get(key);
        if (o instanceof JsonObject) {
            return (JsonObject) o;
        }
        throw new JsonException("JSONObject[" + quote(key) + "] is not a JSONObject.");
    }

    public long getLong(String key) throws JsonException {
        Object o = get(key);
        return o instanceof Number ? ((Number) o).longValue() : (long) getDouble(key);
    }

    public static String[] getNames(JsonObject jo) {
        int length = jo.length();
        if (length == 0) {
            return null;
        }
        Iterator i = jo.keys();
        String[] names = new String[length];
        int j = 0;
        while (i.hasNext()) {
            names[j] = (String) i.next();
            j += 1;
        }
        return names;
    }

    public static String[] getNames(Object object) {
        if (object == null) {
            return null;
        }
        Class klass = object.getClass();
        Field[] fields = klass.getFields();
        int length = fields.length;
        if (length == 0) {
            return null;
        }
        String[] names = new String[length];
        for (int i = 0; i < length; i += 1) {
            names[i] = fields[i].getName();
        }
        return names;
    }

    public String getString(String key) {
        Object obj = get(key);
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public boolean has(String key) {
        return this.map.containsKey(key);
    }

    public boolean isNull(String key) {
        return JsonObject.NULL.equals(opt(key));
    }

    public Iterator keys() {
        return this.map.keySet().iterator();
    }

    public int length() {
        return this.map.size();
    }

    public JsonArray names() {
        JsonArray ja = new JsonArray();
        Iterator keys = keys();
        while (keys.hasNext()) {
            ja.put(keys.next());
        }
        return ja.length() == 0 ? null : ja;
    }

    static public String numberToString(Number n) throws JsonException {
        if (n == null) {
            throw new JsonException("Null pointer");
        }
        testValidity(n);

        // Shave off trailing zeros and decimal point, if possible.

        String s = n.toString();
        if (s.indexOf('.') > 0 && s.indexOf('e') < 0 && s.indexOf('E') < 0) {
            while (s.endsWith("0")) {
                s = s.substring(0, s.length() - 1);
            }
            if (s.endsWith(".")) {
                s = s.substring(0, s.length() - 1);
            }
        }
        return s;
    }

    public Object opt(String key) {
        return key == null ? null : this.map.get(key);
    }

    public boolean optBoolean(String key) {
        return optBoolean(key, false);
    }

    public boolean optBoolean(String key, boolean defaultValue) {
        try {
            return getBoolean(key);
        } catch (Exception e) {
            return defaultValue;
        }
    }

    public JsonObject put(String key, Collection value) throws JsonException {
        put(key, new JsonArray(value));
        return this;
    }

    public double optDouble(String key) {
        return optDouble(key, Double.NaN);
    }

    public double optDouble(String key, double defaultValue) {
        try {
            Object o = opt(key);
            return o instanceof Number
                    ? ((Number) o).doubleValue()
                    : new Double((String) o).doubleValue();
        } catch (Exception e) {
            return defaultValue;
        }
    }

    public int optInt(String key) {
        return optInt(key, 0);
    }

    public int optInt(String key, int defaultValue) {
        try {
            return getInt(key);
        } catch (Exception e) {
            return defaultValue;
        }
    }

    public JsonArray optJSONArray(String key) {
        Object o = opt(key);
        return o instanceof JsonArray ? (JsonArray) o : null;
    }

    public JsonObject optJSONObject(String key) {
        Object o = opt(key);
        return o instanceof JsonObject ? (JsonObject) o : null;
    }

    public long optLong(String key) {
        return optLong(key, 0);
    }

    public long optLong(String key, long defaultValue) {
        try {
            return getLong(key);
        } catch (Exception e) {
            return defaultValue;
        }
    }

    public String optString(String key) {
        return optString(key, "");
    }

    public String optString(String key, String defaultValue) {
        Object o = opt(key);
        return o != null ? o.toString() : defaultValue;
    }

    public JsonObject put(String key, boolean value) throws JsonException {
        put(key, value ? Boolean.TRUE : Boolean.FALSE);
        return this;
    }

    public JsonObject put(String key, double value) throws JsonException {
        put(key, new Double(value));
        return this;
    }

    public JsonObject put(String key, int value) throws JsonException {
        put(key, new Integer(value));
        return this;
    }

    public JsonObject put(String key, long value) throws JsonException {
        put(key, new Long(value));
        return this;
    }

    public JsonObject put(String key, Map value) throws JsonException {
        put(key, new JsonObject(value));
        return this;
    }

    public JsonObject put(String key, Object value) throws JsonException {
        if (key == null) {
            throw new JsonException("Null key.");
        }
        if (value != null) {
            testValidity(value);
            this.map.put(key, value);
        } else {
            remove(key);
        }
        return this;
    }

    public JsonObject putOnce(String key, Object value) throws JsonException {
        if (key != null && value != null) {
            if (opt(key) != null) {
                throw new JsonException("Duplicate key \"" + key + "\"");
            }
            put(key, value);
        }
        return this;
    }

    public JsonObject putOpt(String key, Object value) throws JsonException {
        if (key != null && value != null) {
            put(key, value);
        }
        return this;
    }

    public static String quote(String string) {
        if (string == null || string.length() == 0) {
            return "\"\"";
        }

        char b;
        char c = 0;
        int i;
        int len = string.length();
        StringBuffer sb = new StringBuffer(len + 4);
        String t;

        sb.append('"');
        for (i = 0; i < len; i += 1) {
            b = c;
            c = string.charAt(i);
            switch (c) {
                case '\\':
                case '"':
                    sb.append('\\');
                    sb.append(c);
                    break;
                case '/':
                    if (b == '<') {
                        sb.append('\\');
                    }
                    sb.append(c);
                    break;
                case '\b':
                    sb.append("\\b");
                    break;
                case '\t':
                    sb.append("\\t");
                    break;
                case '\n':
                    sb.append("\\n");
                    break;
                case '\f':
                    sb.append("\\f");
                    break;
                case '\r':
                    sb.append("\\r");
                    break;
                default:
                    if (c < ' ' || (c >= '\u0080' && c < '\u00a0') || (c >= '\u2000' && c < '\u2100')) {
                        t = "000" + Integer.toHexString(c);
                        sb.append("\\u" + t.substring(t.length() - 4));
                    } else {
                        sb.append(c);
                    }
            }
        }
        sb.append('"');
        return sb.toString();
    }

    public Object remove(String key) {
        return this.map.remove(key);
    }

    public Iterator sortedKeys() {
        return new TreeSet(this.map.keySet()).iterator();
    }

    static public Object stringToValue(String s) {
        if (s.equals("")) {
            return s;
        }
        if (s.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (s.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        if (s.equalsIgnoreCase("null")) {
            return JsonObject.NULL;
        }

        char b = s.charAt(0);
        if ((b >= '0' && b <= '9') || b == '.' || b == '-' || b == '+') {
            if (b == '0') {
                if (s.length() > 2 && (s.charAt(1) == 'x' || s.charAt(1) == 'X')) {
                    try {
                        return new Integer(Integer.parseInt(s.substring(2), 16));
                    } catch (Exception e) {
                        /* Ignore the error */
                    }
                } else {
                    try {
                        return new Integer(Integer.parseInt(s, 8));
                    } catch (Exception e) {
                        /* Ignore the error */
                    }
                }
            }
            try {
                return new Integer(s);
            } catch (Exception e) {
                try {
                    return new Long(s);
                } catch (Exception f) {
                    try {
                        return new Double(s);
                    } catch (Exception g) {
                        /* Ignore the error */
                    }
                }
            }
        }
        return s;
    }

    static void testValidity(Object o) throws JsonException {
        if (o != null) {
            if (o instanceof Double) {
                if (((Double) o).isInfinite() || ((Double) o).isNaN()) {
                    throw new JsonException("JSON does not allow non-finite numbers.");
                }
            } else if (o instanceof Float) {
                if (((Float) o).isInfinite() || ((Float) o).isNaN()) {
                    throw new JsonException("JSON does not allow non-finite numbers.");
                }
            }
        }
    }

    public JsonArray toJSONArray(JsonArray names) throws JsonException {
        if (names == null || names.length() == 0) {
            return null;
        }
        JsonArray ja = new JsonArray();
        for (int i = 0; i < names.length(); i += 1) {
            ja.put(this.opt(names.getString(i)));
        }
        return ja;
    }

    @Override
    public String toString() {
        try {
            Iterator keys = keys();
            StringBuffer sb = new StringBuffer("{");

            while (keys.hasNext()) {
                if (sb.length() > 1) {
                    sb.append(',');
                }
                Object o = keys.next();
                sb.append(quote(o.toString()));
                sb.append(':');
                sb.append(valueToString(this.map.get(o)));
            }
            sb.append('}');
            return sb.toString();
        } catch (Exception e) {
            return null;
        }
    }

    public String toString(int indentFactor) throws JsonException {
        return toString(indentFactor, 0);
    }

    String toString(int indentFactor, int indent) throws JsonException {
        int j;
        int n = length();
        if (n == 0) {
            return "{}";
        }
        Iterator keys = sortedKeys();
        StringBuffer sb = new StringBuffer("{");
        int newindent = indent + indentFactor;
        Object o;
        if (n == 1) {
            o = keys.next();
            sb.append(quote(o.toString()));
            sb.append(": ");
            sb.append(valueToString(this.map.get(o), indentFactor, indent));
        } else {
            while (keys.hasNext()) {
                o = keys.next();
                if (sb.length() > 1) {
                    sb.append(",\n");
                } else {
                    sb.append('\n');
                }
                for (j = 0; j < newindent; j += 1) {
                    sb.append(' ');
                }
                sb.append(quote(o.toString()));
                sb.append(": ");
                sb.append(valueToString(this.map.get(o), indentFactor, newindent));
            }
            if (sb.length() > 1) {
                sb.append('\n');
                for (j = 0; j < indent; j += 1) {
                    sb.append(' ');
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }

    static String valueToString(Object value) throws JsonException {
        if (value == null || value.equals(null)) {
            return null;
        }
        if (value instanceof JsonString) {
            Object o;
            try {
                o = ((JsonString) value).toJSONString();
            } catch (Exception e) {
                throw new JsonException(e);
            }
            if (o instanceof String) {
                return (String) o;
            }
            throw new JsonException("Bad value from toJSONString: " + o);
        }
        if (value instanceof Number) {
            return numberToString((Number) value);
        }
        if (value instanceof Boolean || value instanceof JsonObject || value instanceof JsonArray) {
            return value.toString();
        }
        if (value instanceof Map) {
            return new JsonObject((Map) value).toString();
        }
        if (value instanceof Collection) {
            return new JsonArray((Collection) value).toString();
        }
        if (value.getClass().isArray()) {
            return new JsonArray(value).toString();
        }
        return quote(value.toString());
    }

    static String valueToString(Object value, int indentFactor, int indent) throws JsonException {
        if (value == null || value.equals(null)) {
            return "null";
        }
        try {
            if (value instanceof JsonString) {
                Object o = ((JsonString) value).toJSONString();
                if (o instanceof String) {
                    return (String) o;
                }
            }
        } catch (Exception e) {
            /* forget about it */
        }
        if (value instanceof Number) {
            return numberToString((Number) value);
        }
        if (value instanceof Boolean) {
            return value.toString();
        }
        if (value instanceof JsonObject) {
            return ((JsonObject) value).toString(indentFactor, indent);
        }
        if (value instanceof JsonArray) {
            return ((JsonArray) value).toString(indentFactor, indent);
        }
        if (value instanceof Map) {
            return new JsonObject((Map) value).toString(indentFactor, indent);
        }
        if (value instanceof Collection) {
            return new JsonArray((Collection) value).toString(indentFactor, indent);
        }
        if (value.getClass().isArray()) {
            return new JsonArray(value).toString(indentFactor, indent);
        }
        return quote(value.toString());
    }

    public Writer write(Writer writer) throws JsonException {
        try {
            boolean b = false;
            Iterator keys = keys();
            writer.write('{');

            while (keys.hasNext()) {
                if (b) {
                    writer.write(',');
                }
                Object k = keys.next();
                writer.write(quote(k.toString()));
                writer.write(':');
                Object v = this.map.get(k);
                if (v instanceof JsonObject) {
                    ((JsonObject) v).write(writer);
                } else if (v instanceof JsonArray) {
                    ((JsonArray) v).write(writer);
                } else {
                    writer.write(valueToString(v));
                }
                b = true;
            }
            writer.write('}');
            return writer;
        } catch (IOException e) {
            throw new JsonException(e);
        }
    }
}