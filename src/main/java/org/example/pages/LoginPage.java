package org.example.pages;

import org.example.objects.LoginObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage {
    WebDriver driver;
    BasePage basePage;
    LoginObject loginObject;
    By emailInput;
    By passwordInput;
    By loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        basePage = new BasePage(driver);
        loginObject = new LoginObject(driver);
        emailInput = loginObject.getInputEmail();
        passwordInput = loginObject.getInputPassword();
        loginButton = loginObject.getLoginButton();
    }

    public void enterEmail(String email) throws InterruptedException {
        basePage.inputText(emailInput, email);
    }
    public void enterPassword(String password) throws InterruptedException {
        basePage.waitForElementVisible(emailInput).sendKeys(Keys.TAB);
        basePage.inputText(passwordInput, password);
    }
    public void clickLogin() throws InterruptedException {
        basePage.click(loginButton);
    }
}
