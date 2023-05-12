package com.shra012.decorator.java.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

class LowerCaseInputStreamTests {
    @Test
    void shouldConvertCharactersToLowerCase() {
        StringBuilder sb = new StringBuilder();
        try (FileInputStream fis = new FileInputStream("C:\\Shravan\\Learning\\Language\\Java\\Design\\design-patterns\\head-first-design-patterns\\src\\test\\resources\\MixedCharacters.txt");
             BufferedInputStream bis = new BufferedInputStream(fis);
             LowerCaseInputStream lis = new LowerCaseInputStream(bis)) {
            int content;
            // reads a byte at a time, if it reached end of the file, returns -1
            while ((content = lis.read()) != -1) {
                sb.append((char)content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("this file contains the characters in mixed cases", sb.toString());
    }
}
