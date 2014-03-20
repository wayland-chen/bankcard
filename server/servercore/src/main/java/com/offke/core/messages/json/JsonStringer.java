package com.offke.core.messages.json;

import java.io.StringWriter;

public class JsonStringer extends JsonWriter {
    public JsonStringer() {
        super(new StringWriter());
    }

    @Override
    public String toString() {
        return this.mode == 'd' ? this.writer.toString() : null;
    }
}
