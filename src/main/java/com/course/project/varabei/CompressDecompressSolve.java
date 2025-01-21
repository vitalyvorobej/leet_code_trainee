package com.course.project.varabei;

/**
 * На вход подается строка, состоящая из заглавных букв английского алфавита.
 * Символы часто повторяются - каждый символ может повторяться несколько раз подряд.
 * <p>
 * Нужно реализовать RLE сжатие - писать символ в output только один раз, а следом за ним - число повторений.
 * <p>
 * Пример:
 * Input: AAAAABBBCDDDDEEF
 * Output: A5B3C1D4E2F1
 * <p>
 * ------------------------------------------
 * <p>
 * После реализации сжатия, необходимо реализовать функцию, которая будет выполнять обратное преобразование:
 * <p>
 * Пример:
 * Input: A5B3C1D4E2F1
 * Output: AAAAABBBCDDDDEEF
 */
public class CompressDecompressSolve {

    public static void main(String[] args) {
        System.out.println(compress("AAAAABBBCDDDDEEEF"));
        System.out.println(decompress("A5B3C1D4E2F1"));
    }

    public static String compress(String input) {
        StringBuilder sb = new StringBuilder();

        char[] charArray = input.toCharArray();
        int length = input.length();
        int count = 1;

        if (length == 1) {
            sb.append(input.charAt(0));
            sb.append(count);
        }

        for (int i = 0; i < length - 1; i++) {
            if (charArray[i] == charArray[i + 1]) {
                count++;
            } else {
                sb.append(input.charAt(i));
                sb.append(count);
                count = 1;
            }

            if (i + 1 == length - 1) {
                sb.append(input.charAt(i + 1));
                sb.append(count);
            }
        }

        return sb.toString();
    }

    public static String decompress(String input) {
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        boolean flag = true;

        for (int i = 0; i < input.length() - 1; i++) {
            if (Character.isAlphabetic(input.charAt(i))) {
                while (flag) {
                    sb.append(input.charAt(i));
                    counter++;

                    if (counter == Character.getNumericValue(input.charAt(i + 1))) {
                        counter = 0;
                        flag = false;
                    }
                }

                flag = true;
            }
        }

        return sb.toString();
    }

}