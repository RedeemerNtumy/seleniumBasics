package hover;

import base.BaseTests;
import components.FigureCaption;
import org.testng.annotations.Test;
import pages.HoverPage;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

public class HoverTests extends BaseTests {

    @Test
    public void testHoverUser1() {
        HoverPage hoverPage=homePage.clickHoverLink();
        FigureCaption caption=hoverPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(),"Caption not displayed");
        assertEquals(caption.getCaptionText(),"name: user1","Caption incorrect");
        assertEquals(caption.getLinkText(),"View profile","Caption link text incorrect");
        assertTrue(caption.getLink().endsWith("/users/1"),"Link incorrect");
    }
}
