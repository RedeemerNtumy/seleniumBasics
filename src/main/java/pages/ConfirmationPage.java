package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmationPage {
    WebDriver driver;
    private By confirmationMessage= By.cssSelector("h1");

    public ConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }


    public String getConfirmationMessageText() {
        return driver.findElement(confirmationMessage).getText();
    }


}
