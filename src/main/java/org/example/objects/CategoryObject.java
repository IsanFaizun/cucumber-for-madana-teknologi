package org.example.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryObject {
    WebDriver driver;

    public CategoryObject(WebDriver driver) {
        this.driver = driver;
    }

    public By getTextKategori() {
        return By.xpath("//*[contains(text(), 'Kategori Proyek')]");
    }
    public By getButtonTambah() {
        return By.xpath("//*[@id=\"cat-list\"]/div[2]/div[2]/button");
    }
    public By getModal() {
        return By.xpath("//div[contains(@class, 'v-card-title') and contains(text(), 'Kategori')]");
    }
    public By getInputNamaKategori() {
        return By.xpath("//input[@placeholder='Masukkan nama kategori']");
    }
    public By getButtonSimpan() {
        return By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[3]/form/div/div[2]/button[1]");
    }
    public By getButtonEdit() {
        return By.xpath("//*[@id=\"cat-list\"]/div[3]/div/div/div[1]/table/tbody/tr[5]/td[4]/div/button[1]");
    }
    public By getButtonDelete() {
        return By.xpath("//*[@id=\"cat-list\"]/div[3]/div/div/div[1]/table/tbody/tr[5]/td[4]/div/button[2]");
    }
    public By getDeleteConfirmation() {
        return By.xpath("//*[contains(text(), 'Apakah Anda yakin ingin menghapus kategori ini?')]");
    }
    public By getButtonConfirmDelete() {
        return By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[3]/button[1]");
    }
}
