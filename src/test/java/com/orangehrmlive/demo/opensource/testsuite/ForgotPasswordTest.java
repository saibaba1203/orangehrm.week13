package com.orangehrmlive.demo.opensource.testsuite;

import com.orangehrmlive.demo.opensource.pages.ForgotPasswordPage;
import com.orangehrmlive.demo.opensource.testbase.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends TestBase {
    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();
  @Test
  public void userShouldNavigateToForgotPasswordPageSuccessfully(){
      forgotPasswordPage.clickOnForgotPasswordButton();
      String expectedMessage = "Forgot Your Password?";
      String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Forgot Your Password?')]"));
      Assert.assertEquals("Forgot password is not displayed",expectedMessage , actualMessage);
  }
  }



