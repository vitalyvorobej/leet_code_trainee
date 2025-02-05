package com.course.project.varabei;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CompressDecompressSolveTest {

    @Test
    void compress() {
        String input = "AAAAABBBCDDDDEEEF";
        String expected = "A5B3C1D4E3F1";
        assertEquals(expected, CompressDecompressSolve.compress(input));

        // Тест на строку без повторений
        input = "ABCDEFG";
        expected = "A1B1C1D1E1F1G1";
        assertEquals(expected, CompressDecompressSolve.compress(input));

        // Тест на пустую строку
        input = "";
        expected = "";
        assertEquals(expected, CompressDecompressSolve.compress(input));

        // Тест на строку из одного символа
        input = "A";
        expected = "A1";
        assertEquals(expected, CompressDecompressSolve.compress(input));
    }

    @Test
    void decompress() {
        // Тест на обычную сжатую строку
        String input = "A5B3C1D4E3F1";
        String expected = "AAAAABBBCDDDDEEEF";
        assertEquals(expected, CompressDecompressSolve.decompress(input));

        // Тест на строку без повторений
        input = "A1B1C1D1E1F1G1";
        expected = "ABCDEFG";
        assertEquals(expected, CompressDecompressSolve.decompress(input));

        // Тест на пустую сжатую строку
        input = "";
        expected = "";
        assertEquals(expected, CompressDecompressSolve.decompress(input));

        // Тест на строку из одного символа
        input = "A1";
        expected = "A";
        assertEquals(expected, CompressDecompressSolve.decompress(input));
    }
}