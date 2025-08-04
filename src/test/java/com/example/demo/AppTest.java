package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    
    @Test
    public void testGetGreeting() {
        App app = new App();
        assertEquals("Hello World!", app.getGreeting());
    }

    @Test
    public void testApp() {
        // This test just ensures the App class can be instantiated
        App app = new App();
        assertNotNull(app);
    }
}
