package org.example.pages;

import org.example.objects.DashboardObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    WebDriver driver;
    BasePage basePage;
    DashboardObject homeObject;
    By textDashboard;
    // faq
    By textFaq;
    By faqButton;
    By addFaq;
    By questionFaq;
    By answerFaq;
    By saveFaq;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        basePage = new BasePage(driver);
        homeObject = new DashboardObject(driver);
        textDashboard = homeObject.getTextDashboard();
        // faq
        textFaq = homeObject.getTextFaq();
        faqButton = homeObject.getFaq();
        addFaq = homeObject.getAddFaq();
        questionFaq = homeObject.getInputQuestion();
        answerFaq = homeObject.getInputAnswer();
        saveFaq = homeObject.getSaveFaq();
    }

    public void getTextDashboard() throws InterruptedException {
        basePage.verifyElementVisible(textDashboard);
    }
    public String getActualUrl() {
        return driver.getCurrentUrl();
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

    public void enterQuestion(String question) throws InterruptedException{
        basePage.inputText(questionFaq, question);
    }

    public void enterAnswer(String answer) throws InterruptedException{
        basePage.inputText(questionFaq, answer);
    }

    public void clickSaveFaq() throws InterruptedException{
        basePage.click(saveFaq);
    }
}
