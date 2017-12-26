package com.bitman.kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BouncingBallTest {
    @Test
    public void test1() {
        assertEquals(3, BouncingBall.bouncingBall(3.0, 0.66, 1.5));
    }
    @Test
    public void test2() {
        assertEquals(15, BouncingBall.bouncingBall(30.0, 0.66, 1.5));
    }

    @Test
    public void shouldReturnMinusOneWhen2ndConditionIsFailed() throws Exception {
        assertEquals(-1, BouncingBall.bouncingBall(30.0, 1.5, 1.5));
    }
}