package testerClass;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class calculatorttttTest {
   @Test
    public void testSum()
    {
       calculatortttt c = new calculatortttt();
       assertEquals(7,c.summm(4,3));
    }

    @Test
    void sum() throws Exception {
        calculatortttt c = new calculatortttt();
        assertEquals(7,c.summm(4,3));
    }
}