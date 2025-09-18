package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testGetMessage() {

        assertEquals("i = 3", Main.getMessage(3));

       // assertEquals("i = 5", Main.getMessage(3));

    }
}
