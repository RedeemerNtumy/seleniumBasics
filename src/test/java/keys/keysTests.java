package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

import static org.testng.Assert.assertEquals;

public class keysTests extends BaseTests {

    @Test
    public void keysTestBackspace() {
        KeyPressesPage keyPressesPage=homePage.clickKeyPressesLink();
        keyPressesPage.enterText("A"+ Keys.BACK_SPACE);
        assertEquals(keyPressesPage.getResult(),"You entered: BACK_SPACE");
    }

    @Test
    public void testPi(){
        KeyPressesPage keyPressesPage=homePage.clickKeyPressesLink();
        keyPressesPage.enterPi();
        assertEquals(keyPressesPage.getResult(),"You entered: π=3.14");
    }
}
