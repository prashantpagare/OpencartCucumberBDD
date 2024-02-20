package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MyAccountPage {
	
	public WebDriver driver;
	
	
	public MyAccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void myAccountTitleShouldBeDisplayed(String msg) {
		String expectedMsg = driver.findElement(By.xpath("//h2[text()='"+msg+"']")).getText();
		Assert.assertEquals(msg, expectedMsg);
	}
}
