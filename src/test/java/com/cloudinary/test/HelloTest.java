package com.cloudinary.test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTest {

    @Test
    public void testHelloMessage() {
        String message = "Hello World!";
        assertEquals("Hello World!", message);
    }
}
