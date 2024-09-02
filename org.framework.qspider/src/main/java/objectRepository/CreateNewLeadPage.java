package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewLeadPage {
	
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastName;
	
	@FindBy(xpath="//input[@name='company']")
	private WebElement com;
	
	@FindBy(xpath="//input[@id='mobile']")
	private WebElement mobile;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='code']")
	private WebElement postalCode; 
	
	@FindBy(xpath="//input[@id='country']")
	private WebElement country;
	
	@FindBy(xpath="//input[@id='state']")
	private WebElement state;
	
	@FindBy(xpath="//input[@id='designation']")
	private WebElement title;
	
	@FindBy(xpath="//input[@id='noofemployees']")
	private WebElement numberOfEmp;
	
	@FindBy(xpath="//input[@name='annualrevenue']")
	private WebElement anRevanue;
	
	@FindBy(xpath="//textarea[@name='lane']")
	private WebElement street;
	
	@FindBy(xpath="//input[@id='pobox']")
	private WebElement poBox;
	
	
	public CreateNewLeadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getFirstName() {
		return firstName;
	}


	public WebElement getLastName() {
		return lastName;
	}


	public WebElement getCompany() {
		return com;
	}


	public WebElement getMobile() {
		return mobile;
	}


	public WebElement getEmail() {
		return email;
	}


	public WebElement getPostalCode() {
		return postalCode;
	}


	public WebElement getCountry() {
		return country;
	}


	public WebElement getState() {
		return state;
	}


	public WebElement getTitle() {
		return title;
	}


	public WebElement getNumberOfEmp() {
		return numberOfEmp;
	}


	public WebElement getAnRevanue() {
		return anRevanue;
	}


	public WebElement getStreet() {
		return street;
	}


	public WebElement getPoBox() {
		return poBox;
	}
	
	/**
	 * this is business library to create new lead for tc 1
	 * @param fName
	 * @param lName
	 * @param company
	 */
	public void createLead(String fName,String lName,String company) {
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		com.sendKeys(company);
		
	}
	/**
	 * this is business library to create lead for test case 2
	 * @param fName
	 * @param lName
	 * @param company
	 * @param mobileNo
	 * @param PoCode
	 * @param mail
	 * @param State
	 * @param Country
	 */
	
	public void createLead(String fName,String lName,String company,String mobileNo, String PoCode,String mail, String State, String Country) {
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		com.sendKeys(company);
		mobile.sendKeys(mobileNo);
		postalCode.sendKeys(PoCode);
		email.sendKeys(mail);
		state.sendKeys(State);
		country.sendKeys(Country);
		
	}
	/**
	 * this is business Library to create lead for test case 3
	 * @param fName
	 * @param lName
	 * @param company
	 * @param Title
	 * @param State
	 * @param Country
	 * @param numOfEmp
	 */
	
	public void createLead(String fName,String lName,String company,String Title, String State, String Country,String numOfEmp) {
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		com.sendKeys(company);
		title.sendKeys(Title);
		state.sendKeys(State);
		country.sendKeys(Country);
		numberOfEmp.sendKeys(numOfEmp);
	}
	
	/**
	 * this is business library to create lead for test case 4
	 * @param fName
	 * @param lName
	 * @param company
	 * @param mobileNo
	 * @param PoCode
	 * @param mail
	 * @param State
	 * @param Country
	 * @param annuRevanue
	 * @param Street
	 * @param Pobox
	 */
	public void createLead(String fName,String lName,String company,String mobileNo, String PoCode,String mail, String State, String Country,
			String annuRevanue,String Street,String Pobox) {
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		com.sendKeys(company);
		mobile.sendKeys(mobileNo);
		postalCode.sendKeys(PoCode);
		email.sendKeys(mail);
		state.sendKeys(State);
		country.sendKeys(Country);
		anRevanue.sendKeys(annuRevanue);
		street.sendKeys(Street);
		poBox.sendKeys(Pobox);
		
	}
}
