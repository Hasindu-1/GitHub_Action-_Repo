package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testGreetWithName() {
        assertEquals("Hello, Hasindu!", Main.greet("Hasindu"));
        assertEquals("Hello, Alice!", Main.greet("Alice"));
    }

    @Test
    void testGreetWithEmptyOrNull() {
        assertEquals("Hello, Stranger!", Main.greet(""));
        assertEquals("Hello, Stranger!", Main.greet(null));
    }
}
