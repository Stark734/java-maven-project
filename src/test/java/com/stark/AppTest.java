package com.stark;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testApplicationMessage() {

        String message = "Java Application Started";

        assertEquals(
            "Java Application Started",
            message
        );
    }
}
