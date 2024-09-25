package forgotpassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ConfirmationPage;
import pages.ForgotPasswordPage;

import static org.testng.Assert.assertEquals;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void ForgotPasswordTest(){
        ForgotPasswordPage forgotPasswordPage=homePage.clickForgotPasswordLink();
        forgotPasswordPage.setEmail("TAU@example.com");
        ConfirmationPage confirmationPage=forgotPasswordPage.clickSubmit();
        assertEquals("Internal Server Error",confirmationPage.getConfirmationMessageText(),"The site should be working now");
    }


}
