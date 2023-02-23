package TestScript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibrarices.Baseclass;



public class firstTest extends Baseclass{
	
	@Test
	public void FirstTest() 
	{
		SoftAssert soft=new SoftAssert();
		 home.ClickGears();
		 home.ClickskillrarydemoApp();
		 web.handlechildBrowser();
		 
		 soft.assertTrue(skillraryDemo.getpageHeader().isDisplayed());
		 
		 skillraryDemo.mouseHoverTocourse(web);
		 skillraryDemo.clickseleniumTraining();
		 
		 soft.assertEquals(selenium.getpageHeader(),"Selenium Training");
		 selenium.doubleClickplusButton(web);
		 selenium.clickAddToCart();
		 web.handleAlert();
		
		 web.explicitwait(time,selenium.getItemAddmessage());
		 web.takescreenshot();
		 soft.assertTrue(selenium.getItemAddmessage().isDisplayed());
		 
		 soft.assertAll();	
	}
}
