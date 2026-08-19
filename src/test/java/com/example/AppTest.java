package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testGreet() {

        String result = App.greet("Chandrakanth");

        assertEquals("Hello, Chandrakanth!", result);
    }
}
