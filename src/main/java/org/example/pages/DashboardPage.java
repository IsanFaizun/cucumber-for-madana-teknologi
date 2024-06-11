package org.example.pages;

import org.example.objects.DashboardObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    WebDriver driver;
    BasePage basePage;
    DashboardObject homeObject;
    By textDashboard;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        basePage = new BasePage(driver);
        homeObject = new DashboardObject(driver);
        textDashboard = homeObject.getTextDashboard();
    }

    public void getTextDashboard() throws InterruptedException {
        basePage.verifyElementVisible(textDashboard);
    }
    public String getActualUrl() {
        return driver.getCurrentUrl();
    }
}
