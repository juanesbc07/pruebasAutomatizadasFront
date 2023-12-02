package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GooglePageObject;
import pages.SheetModel;

public class DemoBlazeSteps {

    WebDriver driver = null;
    GooglePageObject googlePageObject;
    SheetModel sheetModel;
//    int tiempo = 10;

    @Given("browser is open2")
    public void browser_is_open() {
        System.out.println("test10");
        System.getProperty("webdriver.chrome.driver", "./src/test/resources/driver/chromedriver");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @Given("user is on demoblaze page")
    public void user_is_on_demoblaze_page() {

        try {
            Thread.sleep(3000);
            System.out.println("test11");
            driver.navigate().to("https://www.demoblaze.com/");
        } catch (InterruptedException e) {}

        System.out.println("test11");
        driver.navigate().to("https://www.demoblaze.com/");
    }

    @When("click on login")public void click_on_login() {
        try {
            Thread.sleep(3000);
            System.out.println("test11.1");
            driver.findElement(By.linkText("Log in")).click();
        } catch (InterruptedException e) {}
    }

    @When("user enter username {string}")
    public void user_enter_a_username(String row) {
        this.sheetModel = new SheetModel();
        sheetModel = googlePageObject.readSheetAndWriteOnSearchField(Integer.parseInt(row));
        try {
            Thread.sleep(1000);
            System.out.println("test11.2");
            driver.findElement(By.id("loginusername")).sendKeys(sheetModel.getUserName());
        } catch (InterruptedException e) {}

    }

    @When("user enter password {string}")
    public void user_enter_a_password(String row) {
        this.sheetModel = new SheetModel();
        sheetModel = googlePageObject.readSheetAndWriteOnSearchField(Integer.parseInt(row));
        try {
            Thread.sleep(1000);
            System.out.println("test11.3");
            driver.findElement(By.id("loginpassword")).sendKeys(sheetModel.getPassword());
        } catch (InterruptedException e) {}
    }

    @When("click on login2")public void click_on_login2() {
        try {
            Thread.sleep(3000);
            System.out.println("test11.4");
            driver.findElement(By.xpath("//button[text()='Log in']")).click();
//            driver.findElement(By.linkText("Log in")).click();
        } catch (InterruptedException e) {}
    }

    @When("click on section {string}")
    public void click_on_section(String row) {
        this.sheetModel = new SheetModel();
        sheetModel = googlePageObject.readSheetAndWriteOnSearchField(Integer.parseInt(row));
        try {
            Thread.sleep(3000);
            System.out.println("test11.5");
            driver.findElement(By.linkText(sheetModel.getSection())).click();
        } catch (InterruptedException e) {}
    }

    @When("click on {string}")
    public void click_on_samsung_galaxy_s6(String row) {
        this.sheetModel = new SheetModel();
        sheetModel = googlePageObject.readSheetAndWriteOnSearchField(Integer.parseInt(row));
        try {
            Thread.sleep(3000);
            System.out.println("test12");
            driver.findElement(By.linkText(sheetModel.getTermino())).click();
        } catch (InterruptedException e) {}

    }

    @When("add product at the cart")
    public void click_on_add_cart() {
        try {
            Thread.sleep(3000);
            System.out.println("test13");
            driver.findElement(By.linkText("Add to cart")).click();
        } catch (InterruptedException e) {}

    }

    @When("click cart to show product")
    public void click_on_cart() {
        System.out.println("test14");
        driver.findElement(By.linkText("Cart")).click();
    }

    @When("click on place order")
    public void click_on_place_order() {
        try {
            Thread.sleep(3000);
            System.out.println("test15");
            driver.findElement(By.xpath("//button[text()='Place Order']")).click();
        } catch (InterruptedException e) {}

    }

    @When("user enters name {string}")
    public void user_enters_a_name_in_search_box(String row) {
        this.sheetModel = new SheetModel();
        sheetModel = googlePageObject.readSheetAndWriteOnSearchField(Integer.parseInt(row));
        try {
            Thread.sleep(1000);
            System.out.println("test16");
            driver.findElement(By.id("name")).sendKeys(sheetModel.getName());
        } catch (InterruptedException e) {}
    }

    @When("user enters country {string}")
    public void user_enters_a_country_in_search_box(String row) {
        this.sheetModel = new SheetModel();
        sheetModel = googlePageObject.readSheetAndWriteOnSearchField(Integer.parseInt(row));
        try {
            Thread.sleep(1000);
            System.out.println("test17");
            driver.findElement(By.id("country")).sendKeys(sheetModel.getCountry());
        } catch (InterruptedException e) {}
    }

    @When("user enters city {string}")
    public void user_enters_a_city_in_search_box(String row) {
        this.sheetModel = new SheetModel();
        sheetModel = googlePageObject.readSheetAndWriteOnSearchField(Integer.parseInt(row));
        try {
            Thread.sleep(1000);
            System.out.println("test18");
            driver.findElement(By.id("city")).sendKeys(sheetModel.getCity());
        } catch (InterruptedException e) {}

    }

    @When("user enters card {string}")
    public void user_enters_a_card_in_search_box(String row) {
        this.sheetModel = new SheetModel();
        sheetModel = googlePageObject.readSheetAndWriteOnSearchField(Integer.parseInt(row));
        try {
            Thread.sleep(1000);
            System.out.println("test19");
            driver.findElement(By.id("card")).sendKeys(sheetModel.getCard());
        } catch (InterruptedException e) {}
    }

    @When("user enters month {string}")
    public void user_enters_a_month_in_search_box(String row) {
        this.sheetModel = new SheetModel();
        sheetModel = googlePageObject.readSheetAndWriteOnSearchField(Integer.parseInt(row));
        try {
            Thread.sleep(1000);
            System.out.println("test20");
            driver.findElement(By.id("month")).sendKeys(sheetModel.getMonth());
        } catch (InterruptedException e) {}
    }

    @When("user enters year {string}")
    public void user_enters_a_year_in_search_box(String row) {
        this.sheetModel = new SheetModel();
        sheetModel = googlePageObject.readSheetAndWriteOnSearchField(Integer.parseInt(row));
        try {
            Thread.sleep(1000);
            System.out.println("test21");
            driver.findElement(By.id("year")).sendKeys(sheetModel.getYear());
        } catch (InterruptedException e) {}

    }

    @When("click on purchase")
    public void click_on_pruchase() {
        try {
            Thread.sleep(1000);
            System.out.println("test17");
            driver.findElement(By.xpath("//button[text()='Purchase']")).click();
        } catch (InterruptedException e) {}

    }

    @Then("verify message success")
    public void verify_message() {
        System.out.println("test18");

        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[10]/h2")).isDisplayed());

        if (driver.findElement(By.xpath("/html/body/div[10]/h2")).isDisplayed()){
            System.out.println("Test is successfully");
        }
    }

}
