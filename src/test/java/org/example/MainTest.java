package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void sampleTest() {
        //pass test
       assertEquals(5, 2 + 3, "Simple math test");

        //fail test
        //assertEquals(6, 2 + 3, "This test is supposed to fail (2 + 3 != 6)");

    }
}
