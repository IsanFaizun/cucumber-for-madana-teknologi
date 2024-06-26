package org.example.pages;

import org.example.objects.DashboardObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    WebDriver driver;
    BasePage basePage;
    DashboardObject homeObject;
    By textDashboard;
    // faq
    By textFaq;
    By modalFaq;
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
        // faq
        textFaq = homeObject.getTextFaq();
        modalFaq = homeObject.getModalFaq();
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

//    public void getModalFaq() throws InterruptedException {
//        basePage.verifyElementVisible(modalFaq);
//    }

    public void clickQuestion() throws InterruptedException{
        basePage.click(questionInput);
    }

    public void enterQuestion(String question) throws InterruptedException{
        basePage.inputText(questionInput, question);
    }

    public void clickAnswer() throws InterruptedException{
        basePage.click(answerInput);
    }

    public void enterAnswer(String answer) throws InterruptedException{
        basePage.inputText(answerInput, answer);
    }

    public void clickSaveFaq() throws InterruptedException{
        basePage.click(saveFaq);
    }
}
