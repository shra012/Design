package com.shra012.decorator.java.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
class InitCapitalInputStreamTests {
    @Test
    void shouldConvertCharactersToLowerCase() {
        StringBuilder sb = new StringBuilder();
        try (FileInputStream fis = new FileInputStream("C:\\Shravan\\Learning\\Language\\Java\\Design\\design-patterns\\head-first-design-patterns\\src\\test\\resources\\MixedCharacters.txt");
             InitCapitalInputStream lis = new InitCapitalInputStream(fis)) {
            int content;
            // reads a byte at a time, if it reached end of the file, returns -1
            while ((content = lis.read()) != -1) {
                sb.append((char)content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("This File Contains The Characters In Mixed Cases", sb.toString());
    }
}
