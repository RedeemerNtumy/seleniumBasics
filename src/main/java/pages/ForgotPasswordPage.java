package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;
    private By emailField= By.id("email");
    private By buttonSubmit= By.id("form_submit");

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public ConfirmationPage clickSubmit() {
        driver.findElement(buttonSubmit).click();
        return new ConfirmationPage(driver);
    }

}
