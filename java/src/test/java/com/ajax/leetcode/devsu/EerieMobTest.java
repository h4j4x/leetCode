package com.ajax.leetcode.devsu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EerieMobTest {
    @Test
    public void test() {
        EerieMob eerieMob = new EerieMob(1);
        Assertions.assertEquals(EerieMob.COMPLETE_GUY, eerieMob.toString());

        eerieMob = new EerieMob(4);
        Assertions.assertEquals("(-_(-_(-_-)_-)", eerieMob.toString());

        eerieMob = new EerieMob(5);
        Assertions.assertEquals("(-_(-_(-_-)_-)_-)", eerieMob.toString());

        eerieMob = new EerieMob(14);
        Assertions.assertEquals("(-(-_-(-_(-_(-_-(-_(-_(-_-)_-)_-)-_-)_-)_-)-)", eerieMob.toString());

        eerieMob = new EerieMob(15);
        Assertions.assertEquals("(-(-_-(-_(-_(-_-(-_(-_(-_-)_-)_-)-_-)_-)_-)-_-)-)", eerieMob.toString());
    }
}
