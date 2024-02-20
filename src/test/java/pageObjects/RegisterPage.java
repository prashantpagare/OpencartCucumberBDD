package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

	public WebDriver driver;
	
	private final By pageTitle = By.xpath("//h1[text()='Register Account']");
	private By firstName = By.xpath("//input[@id='input-firstname']");
	private final By lastName = By.xpath("//input[@id='input-lastname']");
	private final By emailAddress = By.xpath("//input[@id='input-email']");
	private final By phoneNo = By.xpath("//input[@id='input-telephone']");
	private final By password = By.xpath("//input[@id='input-password']");
	private final By confirmPassword = By.xpath("//input[@id='input-confirm']");
//	private final By subscribeYes = By.xpath("//label[@class='radio-inline'][contains(.,'" + string + "')]");
	private final By agreeCheckbox = By.xpath("//input[@name='agree']");
	private final By continueBtn = By.xpath("//input[@value='Continue']");

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}

	public String verifyRegisterPageTitle() {
		return driver.findElement(pageTitle).getText();
	}

	public void enterFirstname(String fname) {
		driver.findElement(firstName).sendKeys(fname);
	}

	public void enterLastname(String lname) {
		driver.findElement(lastName).sendKeys(lname);
	}

	public void enterEmailAddress(String email) {
		driver.findElement(emailAddress).sendKeys(email);
	}

	public void enterPhoneNumber(String pNo) {
		driver.findElement(phoneNo).sendKeys(pNo);
	}

	public void enterPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}

	public void enterConfirmPassword(String conPass) {
		driver.findElement(confirmPassword).sendKeys(conPass);
	}

	public void clickYesAsSubscribeNewsletter(String option) {
		driver.findElement(By.xpath("//label[@class='radio-inline'][contains(.,'" + option + "')]")).click();		
	}
	
	public void clickOnPrivacyPolicyCheckBox() {
		driver.findElement(agreeCheckbox).click();
	}
	
	public void clickOnContinueBtn() {
		driver.findElement(continueBtn).click();
	}
}
