package com.offke.core.messages.json;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class JsonTokener {

    private int index;
    private Reader reader;
    private char lastChar;
    private boolean useLastChar;

    public JsonTokener(Reader reader) {
        this.reader = reader.markSupported() ? reader : new BufferedReader(reader);
        this.useLastChar = false;
        this.index = 0;
    }

    public JsonTokener(String s) {
        this(new StringReader(s));
    }

    public void back() throws JsonException {
        if (useLastChar || index <= 0) {
            throw new JsonException("Stepping back two steps is not supported");
        }
        index -= 1;
        useLastChar = true;
    }

    public static int dehexchar(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'A' && c <= 'F') {
            return c - ('A' - 10);
        }
        if (c >= 'a' && c <= 'f') {
            return c - ('a' - 10);
        }
        return -1;
    }

    public boolean more() throws JsonException {
        char nextChar = next();
        if (nextChar == 0) {
            return false;
        }
        back();
        return true;
    }

    public char next() throws JsonException {
        if (this.useLastChar) {
            this.useLastChar = false;
            if (this.lastChar != 0) {
                this.index += 1;
            }
            return this.lastChar;
        }
        int c;
        try {
            c = this.reader.read();
        } catch (IOException exc) {
            throw new JsonException(exc);
        }

        if (c <= 0) { // End of stream
            this.lastChar = 0;
            return 0;
        }
        this.index += 1;
        this.lastChar = (char) c;
        return this.lastChar;
    }

    public char next(char c) throws JsonException {
        char n = next();
        if (n != c) {
            throw syntaxError("Expected '" + c + "' and instead saw '" + n + "'");
        }
        return n;
    }

    public String next(int n) throws JsonException {
        if (n == 0) {
            return "";
        }

        char[] buffer = new char[n];
        int pos = 0;

        if (this.useLastChar) {
            this.useLastChar = false;
            buffer[0] = this.lastChar;
            pos = 1;
        }

        try {
            int len;
            while ((pos < n) && ((len = reader.read(buffer, pos, n - pos)) != -1)) {
                pos += len;
            }
        } catch (IOException exc) {
            throw new JsonException(exc);
        }
        this.index += pos;

        if (pos < n) {
            throw syntaxError("Substring bounds error");
        }

        this.lastChar = buffer[n - 1];
        return new String(buffer);
    }

    public char nextClean() throws JsonException {
        for (; ; ) {
            char c = next();
            if (c == 0 || c > ' ') {
                return c;
            }
        }
    }

    public String nextString(char quote) throws JsonException {
        char c;
        StringBuffer sb = new StringBuffer();
        for (; ; ) {
            c = next();
            switch (c) {
                case 0:
                case '\n':
                case '\r':
                    throw syntaxError("Unterminated string");
                case '\\':
                    c = next();
                    switch (c) {
                        case 'b':
                            sb.append('\b');
                            break;
                        case 't':
                            sb.append('\t');
                            break;
                        case 'n':
                            sb.append('\n');
                            break;
                        case 'f':
                            sb.append('\f');
                            break;
                        case 'r':
                            sb.append('\r');
                            break;
                        case 'u':
                            sb.append((char) Integer.parseInt(next(4), 16));
                            break;
                        case 'x':
                            sb.append((char) Integer.parseInt(next(2), 16));
                            break;
                        default:
                            sb.append(c);
                    }
                    break;
                default:
                    if (c == quote) {
                        return sb.toString();
                    }
                    sb.append(c);
            }
        }
    }

    public String nextTo(char d) throws JsonException {
        StringBuffer sb = new StringBuffer();
        for (; ; ) {
            char c = next();
            if (c == d || c == 0 || c == '\n' || c == '\r') {
                if (c != 0) {
                    back();
                }
                return sb.toString().trim();
            }
            sb.append(c);
        }
    }

    public String nextTo(String delimiters) throws JsonException {
        char c;
        StringBuffer sb = new StringBuffer();
        for (; ; ) {
            c = next();
            if (delimiters.indexOf(c) >= 0 || c == 0 || c == '\n' || c == '\r') {
                if (c != 0) {
                    back();
                }
                return sb.toString().trim();
            }
            sb.append(c);
        }
    }

    public Object nextValue() throws JsonException {
        char c = nextClean();
        String s;

        switch (c) {
            case '"':
            case '\'':
                return nextString(c);
            case '{':
                back();
                return new JsonObject(this);
            case '[':
            case '(':
                back();
                return new JsonArray(this);
        }

        StringBuffer sb = new StringBuffer();
        while (c >= ' ' && ",:]}/\\\"[{;=#".indexOf(c) < 0) {
            sb.append(c);
            c = next();
        }
        back();

        s = sb.toString().trim();
        if (s.equals("")) {
            throw syntaxError("Missing value");
        }
        return JsonObject.stringToValue(s);
    }

    public char skipTo(char to) throws JsonException {
        char c;
        try {
            int startIndex = this.index;
            reader.mark(Integer.MAX_VALUE);
            do {
                c = next();
                if (c == 0) {
                    reader.reset();
                    this.index = startIndex;
                    return c;
                }
            } while (c != to);
        } catch (IOException exc) {
            throw new JsonException(exc);
        }

        back();
        return c;
    }

    public JsonException syntaxError(String message) {
        return new JsonException(message + toString());
    }

    @Override
    public String toString() {
        return " at character " + index;
    }
}