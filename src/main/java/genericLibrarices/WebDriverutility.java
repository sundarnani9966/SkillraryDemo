package genericLibrarices;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This class contains all reusable methods of web driver
 * @author DELL
 *
 */

public class WebDriverutility {
	WebDriver driver;
	/**
	 * This method  is used to launch browser
	 * @param browser
	 * @param url
	 * @param time
	 * @return
	 */
	public WebDriver openApplication(String browser,String url,long time) {
	
				switch(browser){
					case "chrome":driver=new ChromeDriver();break;
					case "firefox":driver=new FirefoxDriver();break;
					case "edge":driver=new EdgeDriver();break;
					default:System.out.println("invalid browser data");
					
				}
				driver.manage().window().maximize();
				driver.get(url);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				return driver;
			}
			/**
			 * This method is used to mouse hover on an element
			 *  
			 * @param element
			 */
	
			public void mouseHover(WebElement element) {
				Actions a=new Actions(driver);
				a.moveToElement(element).perform();
			}
			/**
			 * This method  is used to double click on an element 
			 * 
			 * @param element
			 */
			public void doubleclickonElement(WebElement element) {
				Actions a=new Actions(driver);
				a.doubleClick(element).perform(); 
			}
			/**
			 * This method is used to drag and drop an element
			 * 
			 * @param src
			 * @param dest
			 */
			public void dragAnddropElement(WebElement src, WebElement dest) {
				Actions a=new Actions(driver);
				a.dragAndDrop(src,dest).perform(); 
			}
			/**
			 * This method  is used to select an element from drop down based on index
			 * 
			 * @param element
			 * @param index
			 */
			public void dropdown(WebElement element,int index) {
				Select s=new Select(element);
				s.selectByIndex(index);
			}
			/**
			 * This method  is used to select an element from drop down based on text 
			 * 
			 * @param text
			 * @param element
			 */
			public void dropdown(String text,WebElement element) {
				Select s=new Select(element);
				s.selectByVisibleText(text);
			}
			/**
			 * This method is used to select an element from drop down based on value
			 * @param element
			 * @param value
			 */
			
			public void dropdown(WebElement element,String value) {
				Select s=new Select(element);
				s.selectByValue(value);
			}
			
			/**
			 * This method is used to switch to frame based on index 
			 * @param index 
			 */
			public void switchToFrame() {
				driver.switchTo().frame(0);
			}
			/**
			 * This method is used to  switch back from frame
			 * @param frame
			 */
			public void switchBackFromFrame() {
				driver.switchTo().defaultContent();
			}
			
			/**
			 * This method is used to handle alert by
			 */
			public void handleAlert() {
				driver.switchTo().alert().accept();
			}
			
			/**
			 * this method is used to handle child browser pop up
			 */
			public void handlechildBrowser() {
				Set<String> windowIDs=driver.getWindowHandles();
				for(String string:windowIDs) {
					driver.switchTo().window(string);
				}
			}
			/**
			 * This method is used to get parent window ID
			 * @return
			 */
			public void switchToparentwindow() {
				driver.switchTo().window(driver.getWindowHandle());
			}
			/**
			 * This method is used to scroll the page till web element 
			 * 
			 * @param element
			 */
			public void scrollToElement(WebElement element) {
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].scrollIntoView(true)",element);
			}
			public void takescreenshot() {
				TakesScreenshot ts=(TakesScreenshot)driver;
				File src=ts.getScreenshotAs(OutputType.FILE);
				File dest=new File("./Screenshot/picture.png");
				try {
					FileUtils.copyFile(src, dest);
				} catch (IOException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			/**
			 * This methods  is used to wait until the visibility  of web element
			 * 
			 * @param time
			 * @param element
			 */
			public void explicitwait(long time,WebElement element) {
				WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
				wait.until(ExpectedConditions.visibilityOf(element));
			}
			/**
			 * this method is used to close current window 
			 */
			public void closeCurrentwindow() {
				driver.close();
			}
			/**
			 * this method is used to close current window and exit browser
			 */
			public void quitBrowser() {
				driver.quit();
			}
}	
				 
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
				
				
			
			
		














