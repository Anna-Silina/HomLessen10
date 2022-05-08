package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicControlsPage extends Page{

    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement checkBoxInput;

    @FindBy (xpath = "//button[@onclick='swapCheckbox()']")
    private WebElement checkBoxButton;

    @FindBy (xpath = "//button[@onclick='swapInput()']")
    private WebElement swapInputButton;

    @FindBy (xpath = "//input[@type='text']")
    private  WebElement input;

    @FindBy (xpath = "//p[@id='message']")
    private WebElement checkBoxMessage;

    public Boolean checkInputVisibility() {
        return input.isEnabled();
    }
    public String getTextCheckBoxMessage() {
        return checkBoxMessage.getText();
    }

    public void openDynamicControlPage(String url) {
        driver.get(url);
    }

    public void clickSwapInputButton() {
        swapInputButton.click();
    }

    public WebElement getCheckBoxMessage() {
        return checkBoxMessage;
    }
}
