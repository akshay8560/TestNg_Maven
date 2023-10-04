package POM_WITH_PageFActory.Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class PageObjectModel {
  WebDriver  driver;

    // with page factory
    //@FindBy(id="UserName")
    @FindBy(how = How.XPATH,using = "//input[@id='userName']")
    WebElement  userName;

    @FindBy(how= How.XPATH,using = "//input[@id='password']")
    WebElement password;

    @FindBy(how=How.XPATH,using = "//button[@id='login']")
    WebElement logionbtn;


    public PageObjectModel(WebDriver ldriver){
        this.driver=ldriver;

    }


   /* public void logindata(){


       userName.sendKeys("gunjankaushik");
        password.sendKeys("Password@123");
        logionbtn.click();

        System.out.println("Login successfull");

    }*/
    public void logindata(String Uname,String uPass){


       userName.sendKeys(Uname);
        password.sendKeys(uPass);
        logionbtn.click();

        System.out.println("Login successfull");

    }


}
