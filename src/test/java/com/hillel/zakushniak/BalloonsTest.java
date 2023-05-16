package com.hillel.zakushniak;

import org.junit.jupiter.api.Test;

import static com.hillel.zakushniak.Balloons.hasNoUpperCase;
import static com.hillel.zakushniak.Balloons.maxNumberOfBalloons;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class BalloonsTest {

    @Test
    void testForUpperCase() {
        String text = "balloon";
        assertFalse(hasNoUpperCase(text), "text should consists of lower case English letters only!");
    }

    @Test
    void testEmptyString() {
        String text = "";
        assertEquals(0, maxNumberOfBalloons(text));
    }

    @Test
    void testHaveWords() {
        String text = "loonbalxballpoon";
        assertEquals(2, maxNumberOfBalloons(text));
    }

    @Test
    void testHaveNoWords() {
        String text = "leetcode";
        assertEquals(0, maxNumberOfBalloons(text));
    }
}
