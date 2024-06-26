package stepDefinitions;

import io.cucumber.java.en.Then;
import org.example.pages.DashboardPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class FaqSteps {
    WebDriver driver;
    DashboardPage dashboardPage;

    public FaqSteps() {
        this.driver = Hooks.getDriver();
        this.dashboardPage = new DashboardPage(driver);
    }

    @Then("User click faq button")
    public void user_click_faq_button() throws InterruptedException {
        dashboardPage.clickFaq();
        dashboardPage.getTextFaq();
        Thread.sleep(2000);
        assertEquals("http://127.0.0.1:8000/dashboard/faq", driver.getCurrentUrl());
    }

    @Then("User click add button")
    public void user_click_add_button() throws InterruptedException {
        dashboardPage.clickAddFaq();
        Thread.sleep(500);
    }

    @Then("User fill the column")
    public void user_fill_the_column() throws InterruptedException{
        WebElement activeElement = driver.switchTo().activeElement();
        activeElement.sendKeys(Keys.TAB);
        dashboardPage.enterQuestion("the question");
        dashboardPage.enterAnswer("the answer");
    }

    @Then("User edit on question column")
    public void user_edit_on_question_column() throws InterruptedException{
        WebElement activeElement = driver.switchTo().activeElement();
        activeElement.sendKeys(Keys.TAB);
        dashboardPage.editQuestion("edit question");
    }

    @Then("User click save")
    public void user_click_save() throws InterruptedException {
        dashboardPage.clickSaveFaq();
    }
}
