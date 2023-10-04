package TestNG.Day8;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamiterizedDemo {

    @Test(priority = 2)
    @Parameters({"name","password"})
    void loginTest(String name,String password){
        System.out.println("My name is:"+name);

        System.out.println("My password is:"+password);

    }

    @Test(priority = 1)
    @Parameters({"username","email"})
    void usernameTest(String username,String email){
        System.out.println("username: "+username);
        System.out.println("Useremail id is :"+email);
    }



}
