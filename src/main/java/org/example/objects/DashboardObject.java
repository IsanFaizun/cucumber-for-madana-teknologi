package org.example.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardObject {
    WebDriver driver;

    public DashboardObject(WebDriver driver) {
        this.driver = driver;
    }

    public By getTextDashboard() {
        return By.xpath("//*[contains(text(), 'Dashboard')]");
    }
}
