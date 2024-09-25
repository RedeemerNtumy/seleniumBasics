package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    WebDriver driver;
    private By inputField=By.id("file-upload");
    private By uploadButton= By.id("file-submit");
    private By uploadedFiles=By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public void uploadFile(String fileName) {
        driver.findElement(inputField).sendKeys(fileName);
        clickUploadButton();
    }

    public String getFileName() {
        return driver.findElement(uploadedFiles).getText();
    }
}
