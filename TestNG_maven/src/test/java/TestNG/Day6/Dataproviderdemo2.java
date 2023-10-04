package TestNG.Day6;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.*;

public class Dataproviderdemo2 {

    // String data provider

  /*  @Test(dataProvider = "provider")
    void dataprovidertest(String s){

        System.out.println(s);
    }

    @DataProvider
    String[] provider(){
        String[] data=new String[]{"Akshay","Vikas","Vimal"};
        return data;
    }*/

    @Test(dataProvider = "provider")
    void dataprovidertest(Object s) {

        System.out.println(s);
    }

   /* @DataProvider
    Object[] provider(){
        Object[] data=new Object[]{22,33,44,55,"Akshay","Vikas"};
        return data;
    }*/

    @DataProvider
    Iterator<String> provider() {
        List<String>data=new ArrayList<>();
        data.add("Akshay");

        return data.iterator();
    }
}