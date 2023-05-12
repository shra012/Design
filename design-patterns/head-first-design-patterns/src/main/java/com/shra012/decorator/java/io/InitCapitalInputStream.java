package com.shra012.decorator.java.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InitCapitalInputStream extends FilterInputStream {
    private boolean isPreviousCharacterSpace = false;
    private boolean isFirstCharacter = true;

    protected InitCapitalInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = in.read();
        if(c == -1){
            return c;
        } else if(isPreviousCharacterSpace || isFirstCharacter) {
            isPreviousCharacterSpace = false;
            isFirstCharacter = false;
            return Character.toUpperCase(c);
        } else {
            isPreviousCharacterSpace = c == 32;
            return Character.toLowerCase(c);
        }
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = in.read(b, off, len);
        for (int i = off; i < off + result; i++){
            b[i] = (byte)Character.toLowerCase((char)b[i]);
        }
        return result;
    }
}
