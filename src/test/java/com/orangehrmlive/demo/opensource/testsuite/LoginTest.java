package com.orangehrmlive.demo.opensource.testsuite;

import com.orangehrmlive.demo.opensource.pages.LoginPage;
import com.orangehrmlive.demo.opensource.testbase.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginPage = new LoginPage();

    @Test
    public void usershouldLoginSuccessfullyWithValidCredentials(){
        loginPage.inputusername();
        loginPage.inputpassword();
        loginPage.clickonloginbutton();
        String expectedMessage = "Welcome Paul";
        String actualMessage = getTextFromElement(By.xpath("//a[@id='welcome']"));
        Assert.assertEquals("welcome text is not displayed", expectedMessage, actualMessage);
    }



}
