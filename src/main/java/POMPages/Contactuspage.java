package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactuspage {
	
	//declaration
	@FindBy(xpath="//img[contains(@src,'contactus')]")
	private WebElement pageHeader;
	@FindBy(name="name")
	private WebElement fullNameTF;
	@FindBy(name="sender")
	private WebElement emailTF;
	@FindBy(name="subject")
	private WebElement subjectTF;
	@FindBy(name="message")
	private WebElement messageTextarea;
	@FindBy(xpath="//button[text()=\"Send us mail\"]")
	private WebElement sendusmailButton;
	
	//Initialization
	public Contactuspage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public WebElement getpageheader() {
		return pageHeader;
	}
	public void submitDetails(String name,String email,String subject,String message) {
		fullNameTF.sendKeys(name);
		emailTF.sendKeys(email);
		subjectTF.sendKeys(subject);
		messageTextarea.sendKeys(message);
		sendusmailButton.click();
	}
	
}
	
	
	
	
