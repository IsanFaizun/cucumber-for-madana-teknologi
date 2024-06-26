package stepDefinitions;

import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.BasePage;
import org.example.pages.CategoryPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CategorySteps {
    WebDriver driver;
    CategoryPage categoryPage;
    BasePage basePage;
    ExtentTest test= Hooks.test;

    public CategorySteps() {
        this.driver = Hooks.getDriver();
        this.categoryPage = new CategoryPage(driver);
        this.basePage = new BasePage(driver);
    }

    @Given("Admin on the categories management page")
    public void admin_on_the_categories_management_page() {
        test.info("Admin on the categories management page");
        driver.get("http://127.0.0.1:8000/dashboard/projects/categories");
    }
    @When("Admin click on the Tambah Kategori button")
    public void admin_click_on_the_tambah_kategori_button() throws InterruptedException {
        test.info("Admin click on the Tambah Kategori button");
        categoryPage.clickTambahKategori();
        categoryPage.getModal();
    }
    @And("Admin fill the column")
    public void admin_fill_the_column() throws InterruptedException {
        test.info("Admin fill the column");
        WebElement activeElement = driver.switchTo().activeElement();
        activeElement.sendKeys(Keys.TAB);
        categoryPage.enterInputNamaKategori("Dummy Mobile");
    }
    @Then("Admin click Simpan button")
    public void admin_click_simpan_button() throws InterruptedException {
        test.info("Admin click Simpan button");
        categoryPage.clickBtnSimpan();
    }
}
