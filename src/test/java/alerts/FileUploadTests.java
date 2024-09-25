package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FileUploadPage;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {
    @Test
    public void testfileUpload() {
        FileUploadPage fileUploadPage=homePage.clickFileUploadLink();
        fileUploadPage.uploadFile("/Users/redeemer/Desktop/ghgh.jpg");
        assertEquals(fileUploadPage.getFileName(),"ghgh.jpg","Upload failed");
    }
}
