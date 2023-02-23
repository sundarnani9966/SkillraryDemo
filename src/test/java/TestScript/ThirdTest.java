package TestScript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibrarices.Baseclass;

public class ThirdTest extends Baseclass {
	@Test
	public void thirdtest() throws InterruptedException {
		SoftAssert soft=new SoftAssert();
		 
		home.searchFor("core java for selenium");
		soft.assertEquals(coreJava.getpageHeader(), "CORE JAVA FOR SELENIUM");
		
		coreJava.ClickcoreJavaForSeleniumLink();
		soft.assertEquals(javavideo.getpageHeader(),"Core Java For Selenium Training");
		
		javavideo.ClickonCookiesIcon1();
		web.switchToFrame();
		javavideo.ClickplayButton();
		Thread.sleep(3000);
		javavideo.ClickPauseButton();
		 
		web.switchBackFromFrame();
		
		javavideo.clickAddTowishListTab();
		 
		soft.assertAll();
		
		
		 
		
	}

}
