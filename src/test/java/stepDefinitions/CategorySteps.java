package stepDefinitions;

import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.BasePage;
import org.example.pages.CategoryPage;
import org.example.pages.DashboardPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CategorySteps {
    WebDriver driver;
    CategoryPage categoryPage;
    DashboardPage dashboardPage;
    BasePage basePage;
    ExtentTest test= Hooks.test;

    public CategorySteps() {
        this.driver = Hooks.getDriver();
        this.categoryPage = new CategoryPage(driver);
        this.basePage = new BasePage(driver);
        this.dashboardPage = new DashboardPage(driver);
    }

    @Given("Admin on the categories management page")
    public void admin_on_the_categories_management_page() throws InterruptedException {
        test.info("Admin on the categories management page");
//        driver.get("http://127.0.0.1:8000/dashboard/projects/categories");
        dashboardPage.navigateToKategoriProyek();
    }
    @When("Admin click on the Tambah Kategori button")
    public void admin_click_on_the_tambah_kategori_button() throws InterruptedException {
        test.info("Admin click on the Tambah Kategori button");
        categoryPage.clickTambahKategori();
        categoryPage.getModal();
    }

    @And("Admin fill the column with {string}")
    public void admin_fill_the_column(String namaKategori) throws InterruptedException {
        test.info("Admin fill the column 'Nama Kategori' with '" + namaKategori + "'");
        WebElement activeElement = driver.switchTo().activeElement();
        activeElement.sendKeys(Keys.TAB);
        categoryPage.enterInputNamaKategori(namaKategori);
    }
    @Then("Admin click Simpan button")
    public void admin_click_simpan_button() throws InterruptedException {
        test.info("Admin click Simpan button");
        categoryPage.clickBtnSimpan();
    }

    @And("Admin logout")
    public void admin_logout() throws InterruptedException {
        new WebDriverWait(driver, Duration.ofSeconds(5));
        dashboardPage.logout();
    }

    @When("Admin click edit button on one of existing category")
    public void admin_click_edit_button_on_one_of_existing_category() throws InterruptedException {
        test.info("Admin click Edit button on one of existing category");
        categoryPage.clickEditKategori();
    }

    @When("Admin click delete button on one of existing category")
    public void admin_click_delete_button_on_one_of_existing_category() throws InterruptedException {
        test.info("Admin click Delete button on one of existing category");
        categoryPage.clickDeleteKategori();
    }

    @And("Delete confirmation appears")
    public void delete_confirmation_appears() throws InterruptedException {
        test.info("Delete confirmation appears");
        categoryPage.getDeleteConfirmation();
    }

    @Then("Admin click Hapus button")
    public void admin_click_hapus_button() throws InterruptedException {
        test.info("Admin click Hapus button");
        categoryPage.clickBtnConfirmDelete();
    }
}
