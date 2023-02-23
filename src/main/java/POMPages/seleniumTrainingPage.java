package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibrarices.WebDriverutility;

public class seleniumTrainingPage {
	//declaration
	@FindBy(xpath="//h1[@class=\"page-header\"]")
	private WebElement pageHeader;
	@FindBy(id="add")
	private WebElement plusbutton;
	@FindBy(xpath=" //button[text()=\" Add to Cart\"]")
	private WebElement addToCartButton;
	@FindBy(xpath="//div[@id=\"callout\"]")
	private WebElement itemAddedMessage;
	
	
	//Initialization
	public seleniumTrainingPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	
	//utilization
	public String getpageHeader() {
		return pageHeader.getText();
	}
	
	public void doubleClickplusButton(WebDriverutility web) {
		web.doubleclickonElement(plusbutton);
	}
	public void clickAddToCart() {
		addToCartButton.click();
	}
	public WebElement getItemAddmessage() {
		return itemAddedMessage;
	}
	
	
}
