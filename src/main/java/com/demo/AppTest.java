package com.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testAddNumbers() {
        int result = App.addNumbers(10, 20);
        assertEquals(30, result);
    }
}
