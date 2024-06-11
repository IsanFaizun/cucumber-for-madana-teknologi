package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hooks {
    static WebDriver driver;

    @Before
    public void setUp() {
        if (driver == null) {
            driver = new EdgeDriver();
            driver.manage().window().maximize();
        }
    }
    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
    public static WebDriver getDriver() {
        return driver;
    }
}
