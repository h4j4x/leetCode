package com.ajax.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanToIntTest {
    @Test
    public void test() {
        int number = RomanToInt.romanToInt("I");
        Assertions.assertEquals(1, number);

        number = RomanToInt.romanToInt("III");
        Assertions.assertEquals(3, number);

        number = RomanToInt.romanToInt("IV");
        Assertions.assertEquals(4, number);

        number = RomanToInt.romanToInt("IX");
        Assertions.assertEquals(9, number);

        number = RomanToInt.romanToInt("LVIII");
        Assertions.assertEquals(58, number);

        number = RomanToInt.romanToInt("MCMXCIV");
        Assertions.assertEquals(1994, number);
    }
}
