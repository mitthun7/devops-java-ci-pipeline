package com.devops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testGreeting() {

        String result = App.greet("Mitthun");

        assertEquals(
            "Hello, Mitthun! Welcome to DevOps CI Pipeline.",
            result
        );
    }
}