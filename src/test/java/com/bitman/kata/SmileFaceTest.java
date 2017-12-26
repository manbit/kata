package com.bitman.kata;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SmileFaceTest {

    @Test
    public void shouldReturn0WhenEmptyList() throws Exception {
        assertThat(SmileFace.countSmiles(new ArrayList<>()), is(0));
    }

    @Test
    public void shouldReturn1WhenOneSimpleSmilePut() throws Exception {
        assertThat(SmileFace.countSmiles(Arrays.asList(":)")), is(1));
    }

    @Test
    public void shouldAcceptOptionalNose() throws Exception {
        assertThat(SmileFace.countSmiles(Arrays.asList(":-)")), is(1));
    }

    @Test
    public void shouldAcceptOptionalOtherNose() throws Exception {
        assertThat(SmileFace.countSmiles(Arrays.asList(":~)")), is(1));
    }

    @Test
    public void shouldRecognizeSemicolonAsEyes() throws Exception {
        assertThat(SmileFace.countSmiles(Arrays.asList(";-)")), is(1));
    }

    @Test
    public void shouldRecognizeDAsSmile() throws Exception {
        assertThat(SmileFace.countSmiles(Arrays.asList(";~D")), is(1));
    }

    @Test
    public void shouldReturn0WhenNoValidSmiles() throws Exception {
        assertThat(SmileFace.countSmiles(Arrays.asList(";(", ":>", ":}", ":]")), is(0));
    }

    @Test
    public void acceptanceTest() throws Exception {
        assertThat(SmileFace.countSmiles(Arrays.asList(":)", ":D", ";-D", ":~)", ";(", ":>", ":}", ":]")), is(4));
    }
}
