package stepDefinitions;

import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.example.pages.LoginPage;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;
    ExtentTest test= Hooks.test;

    public LoginSteps() {
        this.driver = Hooks.getDriver();
        this.loginPage = new LoginPage(driver);
    }

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        test.info("User is on the login page");
        driver.get("http://127.0.0.1:8000/login");
    }

    @When("User submit valid email and password")
    public void user_submit_valid_email_and_password() throws InterruptedException {
        test.info("User submit valid email and password");
        loginPage.enterEmail("admin@madana.com");
        loginPage.enterPassword("qweqweqwe");
        loginPage.clickLogin();
    }
}
