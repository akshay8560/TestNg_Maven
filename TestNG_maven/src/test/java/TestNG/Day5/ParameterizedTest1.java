package TestNG.Day5;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest1 {
    @Test
    @Parameters({"myName","email"})
    public void parameterTest(String myName,String email) {

        System.out.println("Parameterized value is : " + myName);
        System.out.println("Parameterized value is : " + email);
        System.out.println("thread 1 "+Thread.currentThread().getId());
    }
}
