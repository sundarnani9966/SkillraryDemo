package genericLibrarices;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import POMPages.Contactuspage;
import POMPages.HomepaGE;
import POMPages.SkillrarydemoappPage;
import POMPages.TestingPage;
import POMPages.corejavaforselenium;
import POMPages.corejavavideopage;
import POMPages.seleniumTrainingPage;

public class Baseclass {
	protected propertiesFileutility property;
	protected Excelutility excel;
	protected WebDriverutility web;
	protected WebDriver driver;
	protected HomepaGE home;
	protected SkillrarydemoappPage skillraryDemo;
	protected seleniumTrainingPage selenium;
	protected TestingPage testing;
	protected corejavaforselenium coreJava;
	protected corejavavideopage javavideo;
	protected Contactuspage contact;
	protected Long time;
	
	//@BeforeSuite
	//@BeforeTest
	@BeforeClass
	public void ClassConfiguration() {
		property=new propertiesFileutility();
		excel=new Excelutility();
		web=new WebDriverutility();
		
		property.propertyFileInitization(Iconstantpath.PROPERTIES_FILE_PATH);
		excel.excelInitilization(Iconstantpath.EXCEL_FILE_PATH);		
	}
	@BeforeMethod 
	public void methodConfiguration() {
		time=Long.parseLong(property.fetchproperty("timeouts"));
		driver = web.openApplication(property.fetchproperty("browser"),property.fetchproperty("url"),time);
		
		home=new HomepaGE(driver);
		
		Assert.assertTrue(home.getlogo().isDisplayed());
		
		skillraryDemo=new SkillrarydemoappPage(driver);
		selenium=new seleniumTrainingPage(driver);
		coreJava=new corejavaforselenium(driver);
		javavideo=new corejavavideopage(driver);
		testing= new TestingPage(driver);
		contact=new Contactuspage(driver);
		
	}
	
	@AfterMethod
	public void methodTearDown() {
		web.quitBrowser();
	}
	@AfterClass
	public void classtearDown() {
		excel.closeExcel();
	}
	//@AfterTest
	//@AfterSuite
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
