package com.yimin.bank;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestJunit {

    @Test
    public void testFunction() {
        assertEquals(8, Main.findSmallestDifference(new int[]{1, 3, 15, 11, 2}, new int[]{23, 127, 235}));

    }

    @Test
    public void testFunctionA() {
        assertEquals(7, Main.findSmallestDifference(new int[]{1, 3, 15, 11, 2}, new int[]{10, 10, 23, 127, 235}));
    }

    @Test
    public void testFunctionB() {
        assertEquals(5, Main.findSmallestDifference(new int[]{15, 11, 2}, new int[]{10, 55, 23, 127, 235}));
    }
}