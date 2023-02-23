 package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepaGE {
	//Declaration
	@FindBy(xpath="//img[@alt=\"SkillRary\"]")
	private WebElement logo;
	@FindBy(name="q")
	private WebElement searchTF;
	@FindBy(xpath="//input[@value=\"go\"]")
	private WebElement searchButton;
	@FindBy(xpath="//a[text()=\" GEARS \"]")
	private WebElement gearsTab;
	@FindBy(xpath="//ul[@class=\"dropdown-menu gear_menu\"]/descendant::a[text()=\" SkillRary Demo APP\"]")
	private WebElement skillrarydemoappLink;
	
	//initialization
	public HomepaGE(WebDriver driver) {
		PageFactory.initElements(driver,this);	
	}
	
	//utilization
	public WebElement getlogo() {
		return logo;
	}
	public void searchFor(String data) {
		searchTF.sendKeys(data);
		searchButton.click();
	}
	public void ClickGears() {
		gearsTab.click();
	}
	public void ClickskillrarydemoApp() {
		skillrarydemoappLink.click();
	}
}
	
	
	


 