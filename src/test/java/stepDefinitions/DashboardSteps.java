package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.example.pages.DashboardPage;

public class DashboardSteps {
    WebDriver driver;
    DashboardPage dashboardPage;

    public DashboardSteps() {
        this.driver = Hooks.getDriver();
        this.dashboardPage = new DashboardPage(driver);
    }

    @Then("User should be redirected to the Admin Dashboard")
    public void user_should_be_redirected_to_the_admin_dashboard() throws InterruptedException {
        dashboardPage.getTextDashboard();
        String expectedUrl = "http://127.0.0.1:8000/dashboard";
        Assert.assertEquals(dashboardPage.getActualUrl(), expectedUrl);
    }
}
