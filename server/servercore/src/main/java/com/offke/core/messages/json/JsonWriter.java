package com.offke.core.messages.json;

import java.io.IOException;
import java.io.Writer;

public class JsonWriter {
    private static final int maxdepth = 20;
    private boolean comma;

    protected char mode;

    private JsonObject stack[];

    private int top;

    protected Writer writer;

    public JsonWriter(Writer w) {
        this.comma = false;
        this.mode = 'i';
        this.stack = new JsonObject[maxdepth];
        this.top = 0;
        this.writer = w;
    }

    private JsonWriter append(String s) throws JsonException {
        if (s == null) {
            throw new JsonException("Null pointer");
        }
        if (this.mode == 'o' || this.mode == 'a') {
            try {
                if (this.comma && this.mode == 'a') {
                    this.writer.write(',');
                }
                this.writer.write(s);
            } catch (IOException e) {
                throw new JsonException(e);
            }
            if (this.mode == 'o') {
                this.mode = 'k';
            }
            this.comma = true;
            return this;
        }
        throw new JsonException("Value out of sequence.");
    }

    public JsonWriter array() throws JsonException {
        if (this.mode == 'i' || this.mode == 'o' || this.mode == 'a') {
            this.push(null);
            this.append("[");
            this.comma = false;
            return this;
        }
        throw new JsonException("Misplaced array.");
    }

    private JsonWriter end(char m, char c) throws JsonException {
        if (this.mode != m) {
            throw new JsonException(m == 'o' ? "Misplaced endObject." : "Misplaced endArray.");
        }
        this.pop(m);
        try {
            this.writer.write(c);
        } catch (IOException e) {
            throw new JsonException(e);
        }
        this.comma = true;
        return this;
    }

    public JsonWriter endArray() throws JsonException {
        return this.end('a', ']');
    }

    public JsonWriter endObject() throws JsonException {
        return this.end('k', '}');
    }

    public JsonWriter key(String s) throws JsonException {
        if (s == null) {
            throw new JsonException("Null key.");
        }
        if (this.mode == 'k') {
            try {
                if (this.comma) {
                    this.writer.write(',');
                }
                stack[top - 1].putOnce(s, Boolean.TRUE);
                this.writer.write(JsonObject.quote(s));
                this.writer.write(':');
                this.comma = false;
                this.mode = 'o';
                return this;
            } catch (IOException e) {
                throw new JsonException(e);
            }
        }
        throw new JsonException("Misplaced key.");
    }

    public JsonWriter object() throws JsonException {
        if (this.mode == 'i') {
            this.mode = 'o';
        }
        if (this.mode == 'o' || this.mode == 'a') {
            this.append("{");
            this.push(new JsonObject());
            this.comma = false;
            return this;
        }
        throw new JsonException("Misplaced object.");

    }

    private void pop(char c) throws JsonException {
        if (this.top <= 0) {
            throw new JsonException("Nesting error.");
        }
        char m = this.stack[this.top - 1] == null ? 'a' : 'k';
        if (m != c) {
            throw new JsonException("Nesting error.");
        }
        this.top -= 1;
        this.mode = this.top == 0 ? 'd' : this.stack[this.top - 1] == null ? 'a' : 'k';
    }

    private void push(JsonObject jo) throws JsonException {
        if (this.top >= maxdepth) {
            throw new JsonException("Nesting too deep.");
        }
        this.stack[this.top] = jo;
        this.mode = jo == null ? 'a' : 'k';
        this.top += 1;
    }

    public JsonWriter value(boolean b) throws JsonException {
        return this.append(b ? "true" : "false");
    }

    public JsonWriter value(double d) throws JsonException {
        return this.value(new Double(d));
    }

    public JsonWriter value(long l) throws JsonException {
        return this.append(Long.toString(l));
    }

    public JsonWriter value(Object o) throws JsonException {
        return this.append(JsonObject.valueToString(o));
    }
}
