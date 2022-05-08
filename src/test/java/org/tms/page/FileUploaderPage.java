package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUploaderPage  extends Page {


    @FindBy(xpath = "//input[@class='dz-hidden-input']")
    private WebElement hiddenUpload;

    @FindBy(xpath = "//div[@id='uploaded-files']")
    private WebElement uploadFile;

    @FindBy(xpath = "//input[@id='file-submit']")
    private WebElement uploadButton;


    @FindBy(xpath = "//span[@data-dz-name]")
    private WebElement uploadFileSpan;

    public void openSrcFileToHiddenUpload(String link) {

        hiddenUpload.sendKeys(link);
    }
    public void openUploadPage(String url) {
        driver.get(url);
    }

    public String getTextUploadFileSpan() {

        return uploadFileSpan.getText();
    }
}
