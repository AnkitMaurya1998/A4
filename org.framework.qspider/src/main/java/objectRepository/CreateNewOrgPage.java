package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrgPage {
	
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement orgName;
	
	@FindBy(xpath="//input[@name='website']")
	private WebElement webSite;
	
	@FindBy(xpath="//input[@id='employees']")
	private WebElement employees;
	
	@FindBy(xpath="//input[@id='phone']")
	private WebElement phn;
	
	@FindBy(xpath = "//input[@id='otherphone']")
	private WebElement otherPhn;
	
	@FindBy(xpath = "//input[@id='email1']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='bill_city']")
	private WebElement billingCity;
	
	@FindBy(xpath = "//input[@id='bill_state']")
	private WebElement billingState;
	
	
	@FindBy(xpath="//textarea[@name='bill_street']")
	private WebElement billingAddress;
	
	@FindBy(xpath = "(*//input[@value='  Save  '])[2]")
	
	private WebElement saveBtn;
	
	

	public CreateNewOrgPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

}

	public WebElement getOrgName() {
		return orgName;
	}

	public WebElement getWebSite() {
		return webSite;
	}

	public WebElement getEmployees() {
		return employees;
	}

	public WebElement getPhn() {
		return phn;
	}

	public WebElement getOtherPhn() {
		return otherPhn;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getBillingCity() {
		return billingCity;
	}

	public WebElement getBillingState() {
		return billingState;
	}
	public WebElement getBillingAddress() {
	return billingAddress;
	}
	
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	/**
	 * this is business library to create new org for tc 1
	 * @param organisationName
	 * @param web
	 * @param emp
	 */
	public void createOrgnisation(String organisationName, String web, String emp) {
		orgName.sendKeys(organisationName);
		employees.sendKeys(emp);
		webSite.sendKeys(web);
		saveBtn.click();
		
	}
	/**
	 * this is the business library for tc 2
	 * @param OrganisationName
	 * @param web
	 * @param emp
	 * @param phoneNumber
	 * @param otherPhone
	 * @param mailId
	 */
	
	public void createOrganisation(String OrganisationName,String web, String emp,String phoneNumber,String otherPhone, String mailId) {
		orgName.sendKeys(OrganisationName);
		webSite.sendKeys(web);
		employees.sendKeys(emp);
		phn.sendKeys(phoneNumber);
		otherPhn.sendKeys(otherPhone);
		email.sendKeys(mailId);
		saveBtn.click();
	}
	/**
	 * this is business library for test case 3
	 * @param OrganisationName
	 * @param web
	 * @param emp
	 * @param phoneNumber
	 * @param otherPhone
	 * @param mailId
	 * @param billAd
	 * @param billCity
	 * @param billState
	 */
	
	public void createOrganisation(String OrganisationName,String web, String emp,String phoneNumber,String otherPhone, String mailId,String billAd,
			String billCity,String billState) {
		orgName.sendKeys(OrganisationName);
		webSite.sendKeys(web);
		employees.sendKeys(emp);
		phn.sendKeys(phoneNumber);
		otherPhn.sendKeys(otherPhone);
		email.sendKeys(mailId);
		billingAddress.sendKeys(billAd);
		billingCity.sendKeys(billCity);
		billingState.sendKeys(billState);
		saveBtn.click();
	}
	
	/**
	 * this is generic library for test case 4
	 * @param OrganisationName
	 * @param web
	 * @param emp
	 * @param phoneNumber
	 * @param otherPhone
	 * @param mailId
	 * @param billState
	 */
	
	public void createOrganisation(String OrganisationName,String web, String emp,String phoneNumber,String otherPhone, String mailId,String billState){
		orgName.sendKeys(OrganisationName);
		webSite.sendKeys(web);
		employees.sendKeys(emp);
		phn.sendKeys(phoneNumber);
		otherPhn.sendKeys(otherPhone);
		email.sendKeys(mailId);
		billingState.sendKeys(billState);
		
	}

}
