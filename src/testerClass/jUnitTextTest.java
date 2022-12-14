package testerClass;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
@Ignore
public class jUnitTextTest {

    String  msg = "ecomm school";
    jUnitMessage m = new jUnitMessage(msg);

    @Test
    public void printMsg() {
        System.out.println("test msg");
        assertEquals(msg,m.printMsg());
    }

    @Ignore("this  printHiMsg  method  will tested later ")
    @Test
    public void printHiMgs() {
        System.out.println("test hi msg");
        String  msg = "hi "+this.msg;
        assertEquals(msg,m.printHiMgs());
    }
}