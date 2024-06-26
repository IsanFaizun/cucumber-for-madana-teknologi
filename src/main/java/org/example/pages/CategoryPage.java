package org.example.pages;

import org.example.objects.CategoryObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryPage {
    WebDriver driver;
    BasePage basePage;
    CategoryObject categoryObject;
    By textKategori;
    By btnTambah;
    By modal;
    By inputNamaKategori;
    By btnSimpan;
    By btnEdit;
    By btnDelete;
    By deleteConfirmation;
    By btnConfirmDelete;

    public CategoryPage(WebDriver driver) {
        this.driver = driver;
        basePage = new BasePage(driver);
        categoryObject = new CategoryObject(driver);
        textKategori = categoryObject.getTextKategori();
        btnTambah = categoryObject.getButtonTambah();
        modal = categoryObject.getModal();
        inputNamaKategori = categoryObject.getInputNamaKategori();
        btnSimpan = categoryObject.getButtonSimpan();
        btnEdit = categoryObject.getButtonEdit();
        btnDelete = categoryObject.getButtonDelete();
        deleteConfirmation = categoryObject.getDeleteConfirmation();
        btnConfirmDelete = categoryObject.getButtonConfirmDelete();
    }

    public void getTextKategori() throws InterruptedException {
        basePage.verifyElementVisible(textKategori);
    }
    public void clickTambahKategori() throws InterruptedException {
        basePage.click(btnTambah);
    }
    public void getModal() throws InterruptedException {
        basePage.verifyElementVisible(modal);
    }
    public void enterInputNamaKategori(String namaKategori) throws InterruptedException {
        basePage.tabToModal();
        basePage.inputText(inputNamaKategori, namaKategori);
    }
    public void clickBtnSimpan() throws InterruptedException {
        basePage.click(btnSimpan);
    }
    public void clickEditKategori() throws InterruptedException {
        basePage.click(btnEdit);
    }
    public void clickDeleteKategori() throws InterruptedException {
        basePage.click(btnDelete);
    }
    public void getDeleteConfirmation() throws InterruptedException {
        basePage.verifyElementVisible(deleteConfirmation);
    }
    public void clickBtnConfirmDelete() throws InterruptedException {
        basePage.click(btnConfirmDelete);
    }

}
