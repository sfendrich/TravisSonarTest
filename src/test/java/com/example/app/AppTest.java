package com.example.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test 
    public void callMainMethod()
    {
        String[] args = new String[0];
        App app = new App();
        app.main(args);
        assertTrue( true );
    }
}
