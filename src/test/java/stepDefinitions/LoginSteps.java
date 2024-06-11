package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.example.pages.LoginPage;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;

    public LoginSteps() {
        this.driver = Hooks.getDriver();
        this.loginPage = new LoginPage(driver);
    }

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        driver.get("http://127.0.0.1:8000/login");
    }

    @When("User submit valid email and password")
    public void user_submit_valid_email_and_password() throws InterruptedException {
        loginPage.enterEmail("admin@madana.com");
        loginPage.enterPassword("qweqweqwe");
        loginPage.clickLogin();
    }
}
