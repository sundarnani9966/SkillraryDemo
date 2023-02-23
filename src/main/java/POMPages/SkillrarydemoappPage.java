package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibrarices.WebDriverutility;

public class SkillrarydemoappPage {
	//declaration
	@FindBy(xpath="//div[@class=\"navbar-header\"]")
	private WebElement pageHeader;
	
	@FindBy(id="course")
	private WebElement courseTab;
	
	@FindBy(xpath="//span[@class=\"wrappers\"]/a[text()=\"Selenium Training\"]")
	private WebElement seleniumTrainglink;
	
	@FindBy(name="addresstype")
	private WebElement catagorydropdown;
	
	@FindBy(xpath="//a[text()=\"Contact Us\"]")
	private WebElement contactusLink;
	
	//initialization
	public SkillrarydemoappPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public WebElement getpageHeader() {
		return pageHeader;
	}
	public void mouseHoverTocourse(WebDriverutility web) {
		web.mouseHover(courseTab);
	}
	public void clickseleniumTraining() {
	 	seleniumTrainglink.click();
	}
	public void selectcategory(WebDriverutility web,int index) {
		web.dropdown(catagorydropdown,index);
	}
	public void clickcontactus() {
		contactusLink.click();
	}

	public WebElement getcontact() {
		// TODO Auto-generated method stub
		return contactusLink;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
