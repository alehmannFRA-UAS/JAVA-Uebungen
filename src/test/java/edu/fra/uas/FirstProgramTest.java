package edu.fra.uas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Simple Testclass
 */
public class FirstProgramTest {
    
    @BeforeEach                                         
    void setUp() {
        FirstProgram = new FirstProgram();
    }

    /**
     * Test for the multiply method
     */
    @Test
    @DisplayName("Simple Test for multiply method")
    void testOutestMultiply() {
        assertEquals(20, calculator.multiply(4, 5), "Regular multiplication should work");
    }

}
