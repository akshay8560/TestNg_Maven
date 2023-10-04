package TestNG.Day2;

import org.testng.annotations.*;

public class Annotations {

    // types of Annotations
    //1. before suite
    //2. before test
    //3. before class
    //4. before method

    //5. testcase
    // (1) tc 1
    // (2) tc 2


    //6. after method
    //7  after class
    //8. after test
    //9. after suite


    //1
    @BeforeSuite
    void runbrowserurl(){
        System.out.println("1: open browser first"+" @BeforeSuite");

    }
    //2
    @BeforeTest
    void  testwebpage(){
        System.out.println("2: test web page url"+"  @BeforeTest");
    }

    //3

    @BeforeClass
    void login(){
        System.out.println("3: login before the testing"+ "@BeforeClass");
    }


    //4
    @BeforeMethod
    void clearbroweserhistory(){
        System.out.println("4: clear browser history"+ " @BeforeMethod");
    }


    // 5
    @Test(priority = 2)
    void testApp(){
        System.out.println("5: testing your application");
    }
 @Test(priority =1)
    void testApp2(){
        System.out.println("12: testing your application 2");
    }

    // 6
    @AfterMethod
    void Allset(){
        System.out.println("6: All set browser history cleared"+ " @AfterMethod");
    }

    // 7
    @AfterClass
    void logout(){
        System.out.println("7: logout Application "+ " @AfterClass");
    }

    // 8
    @AfterTest
    void testedApp(){
        System.out.println("8: Application succesfully tested"+" @AfterTest");
    }

    // 9
    @AfterSuite
    void closeBrowser(){
        System.out.println("9: close the browser"+" @AfterSuite");
    }




}
