package TestNG.Day1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testng_demo {
@BeforeClass
    @Test
    void  setup(){
        System.out.println("i am inside the setup");
    }

    @Test
    void  testsetup(){
        System.out.println("i am inside the testsetup");
    }


}
