package stepDefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.example.ExtentReportManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    static WebDriver driver;
    static ExtentReports extent;
    static ExtentTest test;

    @Before
    public void setUp(Scenario scenario) {
        if (driver == null) {
            extent = ExtentReportManager.getInstance();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        test = extent.createTest(scenario.getName());
    }
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            test.fail("Scenario failed: " + scenario.getName());
        } else {
            test.pass("Scenario passed: " + scenario.getName());
        }
        if (driver != null) {
            driver.quit();
            extent.flush();
            driver = null;
        }
    }
    public static WebDriver getDriver() {
        return driver;
    }
}
