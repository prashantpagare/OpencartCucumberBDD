package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LandingPage {
	
	public WebDriver driver;
	
	private final By myAccountLink = By.xpath("//span[normalize-space()='My Account']");
	private final By registerLink = By.cssSelector("a[href*='register']");
	private final By opencartLink = By.cssSelector("img[src*='opencart']");
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnMyAccountLink() {
		driver.findElement(myAccountLink).click();
	}
	
	public void clickOnRegisterLink() {
		driver.findElement(registerLink).click();	
		
	}
	
	public String verifyUserIsOnOpencartPage() {
		return driver.findElement(opencartLink).getText();
	}
	
}
