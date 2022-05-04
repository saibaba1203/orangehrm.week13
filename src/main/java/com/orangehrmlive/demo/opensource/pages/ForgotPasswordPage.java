package com.orangehrmlive.demo.opensource.pages;

import com.orangehrmlive.demo.opensource.utility.Utility;
import org.openqa.selenium.By;

public class ForgotPasswordPage extends Utility {
    By forgotpassword = (By.xpath("//a[normalize-space()='Forgot your password?']"));

public void clickOnForgotPasswordButton(){
    clickOnElement(forgotpassword);
}
}
