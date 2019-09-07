package com.one.learn;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author One
 * @date 2019/09/07
 */
public class ArrayExamplesTest {
    @Test
    void name() {
        Gson gson = new Gson();
        int[] ints = {1, 2, 3, 4, 5};
        String[] strings = {"abc", "def", "ghi"};
// Serialization
        String s = gson.toJson(ints);// ==> [1,2,3,4,5]
        assertEquals("[1,2,3,4,5]", s);
        String s1 = gson.toJson(strings);// ==> ["abc", "def", "ghi"]
        assertEquals("[\"abc\",\"def\",\"ghi\"]", s1);

// Deserialization
        int[] ints2 = gson.fromJson("[1,2,3,4,5]", int[].class);
        assertEquals(1, ints2[0]);
        assertEquals(5, ints2[4]);
        // ==> ints2 will be same as ints

    }
}
