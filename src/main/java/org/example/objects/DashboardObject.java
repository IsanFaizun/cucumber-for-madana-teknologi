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

    public By getEditBtn(){
        return By.xpath("/html/body/div[1]/div/div/div/div/div[1]/main/div/section/div[2]/div[3]/div/div/div[1]/table/tbody/tr[1]/td[4]/div/button[1]");
    }

    public By getDeleteBtn(){
        return By.xpath("/html/body/div[1]/div/div/div/div/div[1]/main/div/section/div[2]/div[3]/div/div/div[1]/table/tbody/tr[1]/td[4]/div/button[2]");
    }

    public By getConfirmBtn(){
        return By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[3]/button[1]");
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
        return By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[3]/form/div/div[1]/div/div/div/div[3]/input");
    }

    public By getInputAnswer(){
        return By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[3]/form/div/div[2]/div/div/div/div[3]/textarea");
    }

    public By getSaveFaq(){
        return By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[3]/form/div/div[3]/button[1]");
    }
}
