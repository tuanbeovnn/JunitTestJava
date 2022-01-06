package com.junit.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringHelperTest {

    // AACD => CD ACD => CD CDEF=> CDEF CDAA => CDAA
    @Test
    public void test() {
        StringHelper helper = new StringHelper();
        assertEquals("CD",helper.truncateAInFirst2Position("AACD"));
        assertEquals("CD",helper.truncateAInFirst2Position("ACD"));

        //expected, actual
    }
}
