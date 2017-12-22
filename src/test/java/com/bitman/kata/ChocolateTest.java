package com.bitman.kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChocolateTest {

    @Test
    public void myTests() throws Exception {
        assertEquals(Chocolate.breakChocolate(5, 5) , 24);
        assertEquals(Chocolate.breakChocolate(1, 1) , 0);
    }
}