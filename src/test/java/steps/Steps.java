package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Steps {

    private WebDriver driver;


    @Before
    public void setUp(){
        System.setProperty("webdriver.edge.driver","resources/msedgedriver");
        driver = new EdgeDriver();
    }

    @Given("I am in the login page of the Para Bank Application")
    public void i_am_in_the_login_page_of_the_para_bank_application() {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");

    }
    @When("I enter valid {string} and {string}")
    public void i_enter_valid_credentials(String username, String password) {
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("username")).submit();

    }
    @Then("I should be taken to the Overview Page")
    public void i_should_be_taken_to_the_overview_page() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/h1")).isDisplayed();
        driver.findElement(By.linkText("Log out")).click();
    }

}