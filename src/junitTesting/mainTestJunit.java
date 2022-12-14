package junitTesting;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import testerClass.jUnitTextTest;


public class mainTestJunit {
    public static void main(String[] args) {
        Result result  = JUnitCore.runClasses(jUnitTextTest.class);
        for (Failure failure : result.getFailures())
        {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
