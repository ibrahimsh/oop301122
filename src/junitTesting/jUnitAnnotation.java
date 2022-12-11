package junitTesting;

import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class jUnitAnnotation {
    private ArrayList<Integer> list ;
    @BeforeClass
    public  static void m1()
    {
        System.out.println("@ before class annotation ");
    }
    @Before
    public void  m2(){
        this.list = new ArrayList<>();
        System.out.println("initializing list before  start each test");
    }
    @After
    public void m3()
    {
        System.out.println("run after ALL TESTS");
    }
    @Test
    public void addTest()
    {
        list.add(5);
        assertFalse(list.isEmpty());
        assertEquals(1,list.size());
    }
}
