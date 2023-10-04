package Day1;

import org.testng.annotations.Test;

public class TestNgDemo {
    @Test(priority = 1)
    void setup(){
        System.out.println("i am inside setup");
    }
    @Test(priority = 2)
    void testsetp(){
        System.out.println("i am inside testsetup");
    }
    @Test(priority = 3)
    void terodown(){
        System.out.println("i am inside terodown");
    }


    public static void main(String[] args) {



    }
}
