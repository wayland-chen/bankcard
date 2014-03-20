package com.offke.core.messages.json;

import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Array;
import java.util.*;

public class JsonArray {

    private List<Object> myArrayList;

    public JsonArray() {
        this.myArrayList = new LinkedList<Object>();
    }

    public JsonArray(JsonTokener x) throws JsonException {
        this();
        char c = x.nextClean();
        char q;
        if (c == '[') {
            q = ']';
        } else if (c == '(') {
            q = ')';
        } else {
            throw x.syntaxError("A JSONArray text must start with '['");
        }
        if (x.nextClean() == ']') {
            return;
        }
        x.back();
        for (; ; ) {
            if (x.nextClean() == ',') {
                x.back();
                this.myArrayList.add(null);
            } else {
                x.back();
                this.myArrayList.add(x.nextValue());
            }
            c = x.nextClean();
            switch (c) {
                case ';':
                case ',':
                    if (x.nextClean() == ']') {
                        return;
                    }
                    x.back();
                    break;
                case ']':
                case ')':
                    if (q != c) {
                        throw x.syntaxError("Expected a '" + new Character(q) + "'");
                    }
                    return;
                default:
                    throw x.syntaxError("Expected a ',' or ']'");
            }
        }
    }

    public JsonArray(String source) throws JsonException {
        this(new JsonTokener(source));
    }

    public JsonArray(Collection collection) {
        this.myArrayList = (collection == null) ? new ArrayList() : new LinkedList<Object>(collection);
    }

    public JsonArray(Collection collection, boolean includeSuperClass) {
        this.myArrayList = new ArrayList();
        if (collection != null) {
            for (Iterator iter = collection.iterator(); iter.hasNext(); ) {
                this.myArrayList.add(new JsonObject(iter.next(), includeSuperClass));
            }
        }
    }

    public JsonArray(Object array) throws JsonException {
        this();
        if (array.getClass().isArray()) {
            int length = Array.getLength(array);
            for (int i = 0; i < length; i += 1) {
                this.put(Array.get(array, i));
            }
        } else {
            throw new JsonException("JSONArray initial value should be a string or collection or array.");
        }
    }

    public JsonArray(Object array, boolean includeSuperClass) throws JsonException {
        this();
        if (array.getClass().isArray()) {
            int length = Array.getLength(array);
            for (int i = 0; i < length; i += 1) {
                this.put(new JsonObject(Array.get(array, i), includeSuperClass));
            }
        } else {
            throw new JsonException("JSONArray initial value should be a string or collection or array.");
        }
    }

    public Object get(int index) throws JsonException {
        Object o = opt(index);
        if (o == null) {
            throw new JsonException("JSONArray[" + index + "] not found.");
        }
        return o;
    }

    public boolean getBoolean(int index) throws JsonException {
        Object o = get(index);
        if (o.equals(Boolean.FALSE) || (o instanceof String && ((String) o).equalsIgnoreCase("false"))) {
            return false;
        } else if (o.equals(Boolean.TRUE)
                || (o instanceof String && ((String) o).equalsIgnoreCase("true"))) {
            return true;
        }
        throw new JsonException("JSONArray[" + index + "] is not a Boolean.");
    }

    public double getDouble(int index) throws JsonException {
        Object o = get(index);
        try {
            return o instanceof Number ? ((Number) o).doubleValue() : Double
                    .valueOf((String) o)
                    .doubleValue();
        } catch (Exception e) {
            throw new JsonException("JSONArray[" + index + "] is not a number.");
        }
    }

    public int getInt(int index) throws JsonException {
        Object o = get(index);
        return o instanceof Number ? ((Number) o).intValue() : (int) getDouble(index);
    }

    public JsonArray getJSONArray(int index) throws JsonException {
        Object o = get(index);
        if (o instanceof JsonArray) {
            return (JsonArray) o;
        }
        throw new JsonException("JSONArray[" + index + "] is not a JSONArray.");
    }

    public JsonObject getJSONObject(int index) throws JsonException {
        Object o = get(index);
        if (o instanceof JsonObject) {
            return (JsonObject) o;
        }
        throw new JsonException("JSONArray[" + index + "] is not a JSONObject.");
    }

    public long getLong(int index) throws JsonException {
        Object o = get(index);
        return o instanceof Number ? ((Number) o).longValue() : (long) getDouble(index);
    }

    public String getString(int index) throws JsonException {
        return get(index).toString();
    }

    public boolean isNull(int index) {
        return JsonObject.NULL.equals(opt(index));
    }

    public String join(String separator) throws JsonException {
        int len = length();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < len; i += 1) {
            if (i > 0) {
                sb.append(separator);
            }
            sb.append(JsonObject.valueToString(this.myArrayList.get(i)));
        }
        return sb.toString();
    }

    public int length() {
        return this.myArrayList.size();
    }

    public Object opt(int index) {
        return (index < 0 || index >= length()) ? null : this.myArrayList.get(index);
    }

    public boolean optBoolean(int index) {
        return optBoolean(index, false);
    }

    public boolean optBoolean(int index, boolean defaultValue) {
        try {
            return getBoolean(index);
        } catch (Exception e) {
            return defaultValue;
        }
    }

    public double optDouble(int index) {
        return optDouble(index, Double.NaN);
    }

    public double optDouble(int index, double defaultValue) {
        try {
            return getDouble(index);
        } catch (Exception e) {
            return defaultValue;
        }
    }

    public int optInt(int index) {
        return optInt(index, 0);
    }

    public int optInt(int index, int defaultValue) {
        try {
            return getInt(index);
        } catch (Exception e) {
            return defaultValue;
        }
    }

    public JsonArray optJSONArray(int index) {
        Object o = opt(index);
        return o instanceof JsonArray ? (JsonArray) o : null;
    }

    public JsonObject optJSONObject(int index) {
        Object o = opt(index);
        return o instanceof JsonObject ? (JsonObject) o : null;
    }

    public long optLong(int index) {
        return optLong(index, 0);
    }

    public long optLong(int index, long defaultValue) {
        try {
            return getLong(index);
        } catch (Exception e) {
            return defaultValue;
        }
    }

    public String optString(int index) {
        return optString(index, "");
    }

    public String optString(int index, String defaultValue) {
        Object o = opt(index);
        return o != null ? o.toString() : defaultValue;
    }

    public JsonArray put(boolean value) {
        put(value ? Boolean.TRUE : Boolean.FALSE);
        return this;
    }

    public JsonArray put(Collection value) {
        put(new JsonArray(value));
        return this;
    }

    public JsonArray put(double value) throws JsonException {
        Double d = new Double(value);
        JsonObject.testValidity(d);
        put(d);
        return this;
    }

    public JsonArray put(int value) {
        put(new Integer(value));
        return this;
    }

    public JsonArray put(long value) {
        put(new Long(value));
        return this;
    }

    public JsonArray put(Map value) {
        put(new JsonObject(value));
        return this;
    }

    public JsonArray put(Object value) {
        this.myArrayList.add(value);
        return this;
    }

    public JsonArray put(int index, boolean value) throws JsonException {
        put(index, value ? Boolean.TRUE : Boolean.FALSE);
        return this;
    }

    public JsonArray put(int index, Collection value) throws JsonException {
        put(index, new JsonArray(value));
        return this;
    }

    public JsonArray put(int index, double value) throws JsonException {
        put(index, new Double(value));
        return this;
    }

    public JsonArray put(int index, int value) throws JsonException {
        put(index, new Integer(value));
        return this;
    }

    public JsonArray put(int index, long value) throws JsonException {
        put(index, new Long(value));
        return this;
    }

    public JsonArray put(int index, Map value) throws JsonException {
        put(index, new JsonObject(value));
        return this;
    }

    public JsonArray put(int index, Object value) throws JsonException {
        JsonObject.testValidity(value);
        if (index < 0) {
            throw new JsonException("JSONArray[" + index + "] not found.");
        }
        if (index < length()) {
            this.myArrayList.set(index, value);
        } else {
            while (index != length()) {
                put(JsonObject.NULL);
            }
            put(value);
        }
        return this;
    }

    public JsonObject toJSONObject(JsonArray names) throws JsonException {
        if (names == null || names.length() == 0 || length() == 0) {
            return null;
        }
        JsonObject jo = new JsonObject();
        for (int i = 0; i < names.length(); i += 1) {
            jo.put(names.getString(i), this.opt(i));
        }
        return jo;
    }

    @Override
    public String toString() {
        try {
            return '[' + join(",") + ']';
        } catch (Exception e) {
            return null;
        }
    }

    public String toString(int indentFactor) throws JsonException {
        return toString(indentFactor, 0);
    }

    String toString(int indentFactor, int indent) throws JsonException {
        int len = length();
        if (len == 0) {
            return "[]";
        }
        int i;
        StringBuffer sb = new StringBuffer("[");
        if (len == 1) {
            sb.append(JsonObject.valueToString(this.myArrayList.get(0), indentFactor, indent));
        } else {
            int newindent = indent + indentFactor;
            sb.append('\n');
            for (i = 0; i < len; i += 1) {
                if (i > 0) {
                    sb.append(",\n");
                }
                for (int j = 0; j < newindent; j += 1) {
                    sb.append(' ');
                }
                sb.append(JsonObject.valueToString(this.myArrayList.get(i), indentFactor, newindent));
            }
            sb.append('\n');
            for (i = 0; i < indent; i += 1) {
                sb.append(' ');
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public Writer write(Writer writer) throws JsonException {
        try {
            boolean b = false;
            int len = length();

            writer.write('[');

            for (int i = 0; i < len; i += 1) {
                if (b) {
                    writer.write(',');
                }
                Object v = this.myArrayList.get(i);
                if (v instanceof JsonObject) {
                    ((JsonObject) v).write(writer);
                } else if (v instanceof JsonArray) {
                    ((JsonArray) v).write(writer);
                } else {
                    writer.write(JsonObject.valueToString(v));
                }
                b = true;
            }
            writer.write(']');
            return writer;
        } catch (IOException e) {
            throw new JsonException(e);
        }
    }
}