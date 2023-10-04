package TestNG.day4;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.sql.SQLOutput;

public class AssertaionDemo2 {
    @Test
    void test1(){
        //hard assert
        Assert.assertTrue(true);
      //  Assert.assertFalse(false);
    }
    @Test
    void test2(){
        //Assert.assertTrue(false);
       Assert.assertFalse(false);
    }

    //soft assert and hard asset
    @Test
    void  testSoftAssert(){
        System.out.println("Test soft assert started");
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(12,13);

        System.out.println("Test soft assert completed");
        softAssert.assertAll();

    }
    @Test
    void hardAssert(){
        System.out.println("hard Assert started");
        Assert.assertEquals(12,13);
        System.out.println("Hard assert will completed");

    }




}
