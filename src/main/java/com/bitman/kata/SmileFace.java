package com.bitman.kata;

import java.util.List;

public class SmileFace {
    public static int countSmiles(List<String> smiles) {
        return (int) smiles.stream()
                .filter(smile ->
                        smile.matches("(:|;)(-|~)?(\\)|D)")
                )
                .count();
    }
}
