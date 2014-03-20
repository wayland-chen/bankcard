package com.offke.core.messages.json;

@SuppressWarnings("serial")
public class JsonException extends Exception implements java.io.Serializable {
    private Throwable cause;

    public JsonException(String message) {
        super(message);
    }

    public JsonException(Throwable t) {
        super(t.getMessage());
        this.cause = t;
    }

    @Override
    public Throwable getCause() {
        return this.cause;
    }
}
