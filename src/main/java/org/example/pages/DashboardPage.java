package org.example.pages;

import org.example.objects.DashboardObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {
    WebDriver driver;
    BasePage basePage;
    DashboardObject homeObject;
    By textDashboard;
    By editBtn;
    By deleteBtn;
    By confirmBtn;
    // faq
    By textFaq;
    By faqButton;
    By addFaq;
    By questionInput;
    By answerInput;
    By saveFaq;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        basePage = new BasePage(driver);
        homeObject = new DashboardObject(driver);
        textDashboard = homeObject.getTextDashboard();
        editBtn = homeObject.getEditBtn();
        deleteBtn = homeObject.getDeleteBtn();
        confirmBtn = homeObject.getConfirmBtn();
        // faq
        textFaq = homeObject.getTextFaq();
        faqButton = homeObject.getFaq();
        addFaq = homeObject.getAddFaq();
        questionInput = homeObject.getInputQuestion();
        answerInput = homeObject.getInputAnswer();
        saveFaq = homeObject.getSaveFaq();
    }

    public void getTextDashboard() throws InterruptedException {
        basePage.verifyElementVisible(textDashboard);
    }
    public String getActualUrl() {
        return driver.getCurrentUrl();
    }

    public void clickEditBtn() throws InterruptedException{
        basePage.click(editBtn);
    }

    public void clickDeleteBtn() throws InterruptedException {
        basePage.click(deleteBtn);
    }

    public void clickConfirmBtn() throws InterruptedException {
        basePage.click(confirmBtn);
    }

    // FAQ
    public void getTextFaq() throws InterruptedException {
        basePage.verifyElementVisible(textFaq);
    }

    public void clickFaq() throws InterruptedException{
        basePage.click(faqButton);
    }

    public void clickAddFaq() throws InterruptedException{
        basePage.click(addFaq);
    }

    private void pressTabKey() {
        WebElement activeElement = driver.switchTo().activeElement();
        activeElement.sendKeys(Keys.TAB);
    }

    private void editColumn() {
        WebElement activeElement = driver.switchTo().activeElement();
        activeElement.sendKeys(Keys.CONTROL, "a");
        activeElement.sendKeys(Keys.BACK_SPACE);
    }

    public void enterQuestion(String question) throws InterruptedException{
        pressTabKey();
        basePage.inputText(questionInput, question);
    }

    public void editQuestion(String question) throws InterruptedException{
        pressTabKey();
        editColumn();
        basePage.inputText(questionInput, question);
    }

    public void enterAnswer(String answer) throws InterruptedException{
        basePage.waitForElementVisible(questionInput).sendKeys(Keys.TAB);
        basePage.inputText(answerInput, answer);
    }

    public void clickSaveFaq() throws InterruptedException{
        basePage.click(saveFaq);
    }
}
