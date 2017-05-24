package com.codeclan.example.wordcounter;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by user on 23/05/2017.
 */

public class WordCounter implements CounterProviding {
    private String[] inputstring;
    private String words;

    public int wordCounter(String words) {
        this.inputstring = words.split("\\s");
        return inputstring.length;

    }

}
