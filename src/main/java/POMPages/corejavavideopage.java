package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class corejavavideopage {
	//declaration
	@FindBy(xpath="//h1")
	private WebElement pageHeader;
	@FindBy(xpath = "//a[@class=\"close_cookies\"]")
	private WebElement cookies;
	@FindBy(xpath="//button[@aria-label=\"Play\"]")
	private WebElement playButton;
	@FindBy(xpath="//button[@aria-label=\"Pause\"]")
	private WebElement pauseButton;
	@FindBy(xpath="//span[text()=\"Add To Wishlist\"]")
	private WebElement addTowishlistTab;
	
	//initialization
	public corejavavideopage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public String getpageHeader() {
		return pageHeader.getText();
	}
	public void ClickonCookiesIcon1()
	{
		cookies.click();
	}
	public void ClickplayButton() {
		playButton.click();
	}
	public void ClickPauseButton() {
		pauseButton.click();
	}
	public void clickAddTowishListTab() {
		addTowishlistTab.click();
		
	}

		
	
}
