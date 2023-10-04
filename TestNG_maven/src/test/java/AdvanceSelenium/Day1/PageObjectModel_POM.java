package AdvanceSelenium.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjectModel_POM {

    // POM withod using Page factory
WebDriver driver;
    By usrname=By.xpath("//input[@id='userName']");
    By pasword=By.xpath("//input[@id='password']");
    By loginid=By.xpath("//button[@id='login']");


public PageObjectModel_POM(WebDriver driver){
    this.driver=driver;
}


public void login(){
    driver.findElement(usrname).sendKeys("gunjankaushik");
    driver.findElement(pasword).sendKeys("Password@123");
    driver.findElement(loginid).click();
}



}
