package com.orangehrmlive.demo.opensource.pages;

import com.orangehrmlive.demo.opensource.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By username = By.xpath("//input[@id='txtUsername']");
    By password = By.xpath("//input[@id='txtPassword']");
    By login = (By.xpath("//input[@id='btnLogin']"));
    By welcomemessage = (By.xpath("//a[@id='welcome']"));

    public void inputusername(){
        sendTextToElement(username,"Admin");
    }
    public void inputpassword(){
        sendTextToElement(password,"admin123");
    }
    public void clickonloginbutton(){
        clickOnElement(login);
    }







}





