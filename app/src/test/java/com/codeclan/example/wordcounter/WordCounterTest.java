package com.codeclan.example.wordcounter;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 23/05/2017.
 */

public class WordCounterTest {

    private WordCounter inputstring;

    @Test
    public void canSplitString() {
        inputstring = new WordCounter();
        assertEquals(4,inputstring.wordCounter("hello world hello everybody"));
    }

    @Test
    public void canSplitString2() {
        inputstring = new WordCounter();
        assertEquals(7,inputstring.wordCounter("hello world, hello everybody, hi again people!"));
    }

    @Test
    public void canSplitString3() {
        inputstring = new WordCounter();
        assertEquals(11,inputstring.wordCounter("hello world, hello everybody; hi again people! People of the world."));
    }
}
