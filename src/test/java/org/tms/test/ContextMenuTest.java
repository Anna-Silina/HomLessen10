package org.tms.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.tms.service.ContextMenuPageService;

class ContextMenuPageTest extends BaseTest {

    ContextMenuPageService contextMenuPageService = new ContextMenuPageService();
    private String expectedResultOfAlertMessage = "You selected a context menu";

    @Test
    public void contextMenuPage() {
        contextMenuPageService.openAlert();
        String actualResultOfAlertMessage = contextMenuPageService.getTextAlert();
        contextMenuPageService.closeAlert();
        Assert.assertEquals(actualResultOfAlertMessage, expectedResultOfAlertMessage, "The actual text of the alert does not match the expected one!");
    }

}