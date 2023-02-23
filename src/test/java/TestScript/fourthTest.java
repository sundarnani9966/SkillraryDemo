package TestScript;

import java.util.List;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibrarices.Baseclass;

public class fourthTest extends Baseclass{
	@Test
	public void fourthtest() {
		SoftAssert soft=new SoftAssert();
		 
		home.ClickGears();
		home.ClickskillrarydemoApp();
		web.handlechildBrowser();
		
		soft.assertTrue(skillraryDemo.getpageHeader().isDisplayed());
		
		web.scrollToElement(skillraryDemo.getcontact());
		skillraryDemo.clickcontactus();
		
		soft.assertTrue(contact.getpageheader().isDisplayed());
		List<String> data=excel.fetchDataFromExcel("sheet1");
		contact.submitDetails(data.get(0), data.get(1), data.get(2), data.get(3));
		soft.assertAll();
	}
	

}
