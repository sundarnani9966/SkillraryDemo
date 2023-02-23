package TestScript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import genericLibrarices.Baseclass;

public class SecondTest  extends Baseclass{
	@Test
	public void secondTest() {
		SoftAssert soft= new SoftAssert();
		
		home.ClickGears();
		home.ClickskillrarydemoApp();
		web.handlechildBrowser();
		
		soft.assertTrue(skillraryDemo.getpageHeader().isDisplayed());
		
		skillraryDemo.selectcategory(web, 1);
		soft.assertEquals(testing.getpageHeader(), "Testing");
		
		web.dragAnddropElement(testing.getSeleniumImage(),testing.getcartArea());
		web.scrollToElement(testing.getfacebookIcon());
		testing.clickfacebookIcon();
		
		soft.assertAll();
		
		 
	
	}

}
