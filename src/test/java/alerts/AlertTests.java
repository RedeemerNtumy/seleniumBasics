package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.JavaScriptAlertsPage;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
        JavaScriptAlertsPage javaScriptAlertsPage= homePage.clickJavaScriptAlertsLink();
        javaScriptAlertsPage.clickTriggerAlertButton();
        javaScriptAlertsPage.acceptAlert();
        assertEquals(javaScriptAlertsPage.getResults(), "You successfully clicked an alert","Result text invalid");
    }

    @Test
    public void testGetTextFromAlert(){
        JavaScriptAlertsPage javaScriptAlertsPage= homePage.clickJavaScriptAlertsLink();
        javaScriptAlertsPage.clickTriggerConfirmButton();
        String text=javaScriptAlertsPage.getTextInAlert();
        javaScriptAlertsPage.rejectAlert();
        assertEquals(text, "I am a JS Confirm","Result text invalid");

    }

    @Test
    public void testSetInputInAlert(){
        JavaScriptAlertsPage javaScriptAlertsPage=homePage.clickJavaScriptAlertsLink();
        javaScriptAlertsPage.clickTriggerPromptButton();
        String text="TAU rocks!";
        javaScriptAlertsPage.setInputInAlert(text);
        javaScriptAlertsPage.acceptAlert();
        assertEquals(javaScriptAlertsPage.getResults(),"You entered: TAU rocks!","Result text invalid");

    }
}
