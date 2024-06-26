package stepDefinitions;

import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.example.pages.DashboardPage;

public class DashboardSteps {
    WebDriver driver;
    DashboardPage dashboardPage;
    ExtentTest test= Hooks.test;

    public DashboardSteps() {
        this.driver = Hooks.getDriver();
        this.dashboardPage = new DashboardPage(driver);
    }

    @Then("User should be redirected to the Admin Dashboard")
    public void user_should_be_redirected_to_the_admin_dashboard() throws InterruptedException {
        test.info("User should be redirected to the Admin Dashboard");
        dashboardPage.getTextDashboard();
        String expectedUrl = "http://127.0.0.1:8000/dashboard";
        Assert.assertEquals(dashboardPage.getActualUrl(), expectedUrl);
    }

    @Then("User click edit button")
    public void user_click_edit_button() throws InterruptedException{
        test.info("User click edit button");
        dashboardPage.clickEditBtn();
    }

    @Then("User click delete button")
    public void user_click_delete_button() throws InterruptedException{
        test.info("User click delete button");
        dashboardPage.clickDeleteBtn();
    }
    @Then("User click confirmation")
    public void user_click_confirmation() throws InterruptedException{
        test.info("User click confirmation");
        dashboardPage.clickConfirmBtn();
    }
}
