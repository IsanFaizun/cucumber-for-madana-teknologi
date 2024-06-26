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

    // FAQ
    public By getTextFaq() {
        return By.xpath("//*[contains(text(), 'Frequently Asked Question')]");
    }

    public By getFaq(){
        return By.xpath("/html/body/div[1]/div/div/div/div/aside/aside/ul/li[6]/a");
    }

    public By getAddFaq(){
        return By.xpath("/html/body/div[1]/div/div/div/div/div[1]/main/div/section/div[2]/div[2]/div[2]/button");
    }

    public By getInputQuestion(){
        return By.id("input-25");
    }

    public By getInputAnswer(){
        return By.id("input-28");
    }

    public By getSaveFaq(){
        return By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[3]/form/div/div[3]/button[1]");
    }
}
