package junitTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculatorTest {

   static  calculator c = new calculator();
    @Test
    void sum() {
        //calculator c = new calculator();
        assertEquals(7,c.sum(3,4));
    }

    @Test
    void subtract() {
       // calculator c = new calculator();
        assertEquals(1, c.subtract(3,2));
    }
}