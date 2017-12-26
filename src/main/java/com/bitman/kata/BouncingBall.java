package com.bitman.kata;

public class BouncingBall {
    public static int bouncingBall(double h, double bounce, double window) {
        if (!(h > 0) || !(bounce > 0 && bounce < 1) || !(window < h)) {
            return -1;
        }

        int i = 1;
        double restH = h;

        for (; restH * bounce > window; i += 2) {
            restH = restH * bounce;
        }

        return i;
    }
}
