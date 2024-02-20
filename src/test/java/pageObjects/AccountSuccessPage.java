package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class AccountSuccessPage {
	
	public WebDriver driver;
	
	private By successMsg = By.xpath("//h1");
	private By continueBtn = By.xpath("//a[text()='Continue']");
	
	
	public AccountSuccessPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String confirmSuccessMessage(String msg) {
		return driver.findElement(successMsg).getText();
	}
	
	public void clickOnContinueBtnOnSuccessPage() {
		driver.findElement(continueBtn).click();
	}

}
