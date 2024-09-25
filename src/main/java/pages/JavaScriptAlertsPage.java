package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {
    private WebDriver driver;
    private By triggerAlertButton= By.xpath(".//button[text()='Click for JS Alert']");
    private By triggerConfirmButton= By.xpath(".//button[text()='Click for JS Confirm']");
    private By triggerPromptButton= By.xpath(".//button[text()='Click for JS Prompt']");
    private By results=By.id("result");

    public JavaScriptAlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickTriggerAlertButton() {
        driver.findElement(triggerAlertButton).click();
    }
    public void clickTriggerConfirmButton() {
        driver.findElement(triggerConfirmButton).click();
    }
    public void clickTriggerPromptButton() {
        driver.findElement(triggerPromptButton).click();
    }

    public void rejectAlert(){
        driver.switchTo().alert().dismiss();
    }

    public String getTextInAlert(){
        return driver.switchTo().alert().getText();
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public String getResults() {
        return driver.findElement(results).getText();
    }

    public void setInputInAlert(String text) {
        driver.switchTo().alert().sendKeys(text);
    }
}
