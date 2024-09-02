package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgHomePage {

	/**
	 * this is the pom class for orgHomePage
	 */
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement newORgBtn;
	
	public OrgHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public WebElement getNewORgBtn() {
		return newORgBtn;
	}
	/**
	 * Business library to click on new Org btn
	 */
	
	public void clickOnNewOrgBtn() {
		newORgBtn.click();
	}
	
}
