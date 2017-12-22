package com.bitman.kata;

import java.util.Arrays;

public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        return String.format("(%s) %s-%s",
                getSubArrayAsString(numbers, 0, 3),
                getSubArrayAsString(numbers, 3, 6),
                getSubArrayAsString(numbers, 6, numbers.length));
    }

    private static String getSubArrayAsString(int[] numbers, int from, int to) {
        return Arrays.toString(Arrays.copyOfRange(numbers, from, to))
                .replace(" ", "")
                .replace(",", "")
                .replace("[", "")
                .replace("]", "");
    }
}
