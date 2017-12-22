package com.bitman.kata;

import java.util.ArrayList;
import java.util.List;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        // Insert brilliant code here
        // Insert brilliant code here
        if (walk.length > 10 || walk.length % 2 != 0 || walk.length < 10) {
            return false;
        }

        List<Integer> ns = new ArrayList<>();
        List<Integer> we = new ArrayList<>();
        for (char ch : walk) {
            switch (ch) {
                case 'n':
                    ns.add(1);
                    break;
                case 's':
                    ns.add(-1);
                    break;
                case 'w':
                    we.add(1);
                    break;
                case 'e':
                    we.add(-1);
                    break;
            }
        }

        Integer sumNS = ns.stream()
                .reduce(0, (integer, integer2) -> integer + integer2);
        Integer sumWE = we.stream()
                .reduce(0, (integer, integer2) -> integer + integer2);

        return sumNS + sumWE == 0;
    }
}