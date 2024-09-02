package genricUtilityorLibrary;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumUtility {
	
	
	Actions act=null;
	Select s= null;
	
	/**
	 * this is the method for implicit Wait
	 */
	
	public void implicitWait(WebDriver driver,int particularSecond) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(particularSecond));
	}
	
	/**
	 * this is the generic method to maximize the window
	 */
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	/*----------------------ACTIONS class generic method -----------------*/
	/**
	 * this is generic method to right click on on an element 
	 * @param element
	 */
	
	public void rightClickOnAnElement(WebDriver driver,WebElement element) {
		act=new Actions(driver);
		act.contextClick(element).perform();
	}
	
	/**
	 * this is generic method to click on an element
	 * @param element
	 */
	
	public void clickOnAnElement(WebDriver driver, WebElement element) {
		act=new Actions(driver);
		act.click().perform();
		
	}
	/**
	 * this is the generic method to perform drag and drop 
	 * @param src
	 * @param target
	 */
	public void dragAndDropAnElement(WebDriver driver,WebElement src,WebElement target) {
		act = new Actions(driver);
		act.dragAndDrop(src, target);
		
	}
	/**
	 * this is a generic method to perform dragAPointer
	 * @param src
	 * @param xOffset
	 * @param yOffset
	 */
	
	public void dragAPointer(WebDriver driver,WebElement src, int xOffset,int yOffset) {
			act=new Actions(driver);
			act.dragAndDropBy(src, xOffset, yOffset);
	}
	/**
	 * this is generic method to scroll on a particular element
	 * @param element
	 */
	
	public void scrollToAParticularEelement(WebDriver driver,WebElement element) {
		act= new Actions(driver);
		act.scrollToElement(element).perform();
	}
	/**
	 * this is the generic method to perform moving cursor to a particular element
	 * @param element
	 */
	public void moveCursorToAnElement(WebDriver driver,WebElement element) {
		act= new Actions(driver);
		act.moveToElement(element).perform();
		}
	/**
	 * this is the genric method to perform click and hold 
	 * @param element
	 */
	
	public void holdAnElement(WebDriver driver,WebElement element) {
		act= new Actions(driver);
		act.clickAndHold(element).perform();
	}
	/**
	 * this is generic method to release an element after holding
	 * @param element
	 */
	public void releseAnElement(WebDriver driver,WebElement element) {
		act=new Actions(driver);
		act.release(element).perform();
	}
	/*-----------------------Select class Generic Functions--------------*/
	/**
	 * this is the generic method to select an element by index
	 * @param element
	 * @param indexNum
	 */
	
	public void selectElementByIndex(WebElement element,int indexNum) {
		s=new Select(element);
		s.selectByIndex(indexNum);
	}
	
	public void selectElementByVisibleText(WebElement element ,String text) {
		s= new Select(element);
		s.selectByVisibleText(text);
	}
	/**
	 * this is generic method to select a element by value
	 * @param element
	 * @param value
	 */
	public void selectByValue(WebElement element, String value) {
		s=new Select(element);
		s.selectByValue(value);
		}
	/**
	 * this is the generic method to deselect by index
	 * @param element
	 * @param indexNum
	 */
	public void deselectElementByIndex(WebElement element,int indexNum) {
		s=new Select(element);
		s.deselectByIndex(indexNum);
	}
	/**
	 * this is the generic method to perform deselection by visible test
	 * @param element
	 * @param text
	 */
	public void deselectElementByVisibleText(WebElement element ,String text) {
		s= new Select(element);
		s.deselectByVisibleText(text);
	}
	/**
	 * this is generic method to deselect a element by value
	 * @param element
	 * @param value
	 */
	public void deselectByValue(WebElement element, String value) {
		s=new Select(element);
		s.deselectByValue(value);
		}
	/**
	 * this is the method to deselect all the option
	 * @param element
	 */
	
	public void deselectAll(WebElement element) {
		s= new Select(element);
		s.deselectAll();
	}
	/**
	 * this is generic method to select all the option
	 * @param element
	 * @return
	 */
	
	public List<WebElement> fetchAllSelectedOptions(WebElement element){
		s= new Select(element);
		List<WebElement> all= s.getAllSelectedOptions();
		return all;
	}
	/**
	 * this is the generic method to read all the options 
	 * @param element
	 * @return
	 */
	
	public List<WebElement> fetchAllOptions(WebElement element){
		s= new Select(element);
		List<WebElement> all =s.getOptions();
		return all;
	}
	
	/*---------------------Alert------------------*/
	/**
	 * this is the generic method to accept the alert
	 */
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	/**
	 * this is generic method to dismiss the alert
	 */
	public void dismissAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	/*----------------Frame---------------------*/
	
	/**
	 * this is the generic method to switch frame based on index 
	 * @param childFrameIndex
	 */
	public void switchToChildFrame(WebDriver driver,int childFrameIndex) {
		driver.switchTo().frame(childFrameIndex);
	}
	
	
	
}
