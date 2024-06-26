package stepDefinitions;

import io.cucumber.java.en.Then;
import org.example.pages.DashboardPage;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class FaqSteps {
    WebDriver driver;
    DashboardPage dashboardPage;

    public FaqSteps() {
        this.driver = Hooks.getDriver();
        this.dashboardPage = new DashboardPage(driver);
    }

    @Then("User click FAQ button")
    public void user_click_faq_button() throws InterruptedException {
        dashboardPage.clickFaq();
        dashboardPage.getTextFaq();
        Thread.sleep(2000);
        assertEquals("http://127.0.0.1:8000/dashboard/faq", driver.getCurrentUrl());
    }

    @Then("User click add button")
    public void user_click_add_button() throws InterruptedException {
        dashboardPage.clickAddFaq();
    }

    @Then("User fill all column")
    public void user_fill_all_column() throws InterruptedException {
        dashboardPage.enterQuestion("pertanyaan");
        dashboardPage.enterAnswer("jawaban");
    }

    @Then("User click save")
    public void user_click_save() throws InterruptedException {
        dashboardPage.clickSaveFaq();
    }
}
