package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage<privateWebElementalert, WebElementbox> extends Page {

    private WebElementbox


    privateWebElementalert;

    @Override
    public void uploadFileMethod() {

    }

    @Override
    public void selectFileMethod() {

    }

    public ContextMenuPage openPage(String url) {
        driver.get(url);
        return this;
    }

    @Override
    public String textOfFile() {
        return null;
    }

    public void rightClickOnTheBox() {
        Actions actions = new Actions(driver);
        WebElement box = null;
        actions.contextClick(box).perform();
    }

}

