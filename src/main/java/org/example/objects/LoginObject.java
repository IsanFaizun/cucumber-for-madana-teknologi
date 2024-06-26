package org.example.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginObject {
    WebDriver driver;

    public LoginObject(WebDriver driver) {
        this.driver = driver;
    }

    public By getInputEmail() {
        return By.id("email-input");
    }
    public By getInputPassword() {
//        return By.id("password-input");
        return By.xpath("//*[@id=\"password-input\"]");
    }
    public By getLoginButton() {
        return By.id("login-btn");
    }
}
