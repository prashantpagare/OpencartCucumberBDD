package stepDefinations;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.PageObjectManager;
import pageObjects.RegisterPage;
import utils.TestContextSetup;


public class LandingPageStepDefination {
	
	public WebDriver driver;
	public TestContextSetup testContextSetup;
	public LandingPage landingPage;
	public RegisterPage registerPage;
	public PageObjectManager pageObjectManager;
	
	public LandingPageStepDefination(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
//		this.landingPage = testContextSetup.pageObjectManager.getLandingPage();
		
	}
	
	@Given("the user is on the OpenCart landing page")
	public void the_user_is_on_the_open_cart_landing_page() {
//		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
//		testContextSetup.driver = new ChromeDriver();
//		testContextSetup.driver.manage().window().maximize();
//		testContextSetup.driver.get("https://awesomeqa.com/ui");
//		Assert.assertTrue(testContextSetup.landingPage.verifyUserIsOnOpencartPage().contains("opencart"));
	
	}
	
	@When("the user navigates to the registration page")
	public void the_user_navigates_to_the_registration_page() {
//		landingPage = new LandingPage(testContextSetup.driver);
		landingPage = testContextSetup.pageObjectManager.getLandingPage();
		landingPage.clickOnMyAccountLink();
		landingPage.clickOnRegisterLink();
//		testContextSetup.registerPage = new RegisterPage(testContextSetup.driver);
		testContextSetup.registerPage = testContextSetup.pageObjectManager.getRegisterPage();
		String expectedTitle = "Register Account";
		String actualTitle = testContextSetup.registerPage.verifyRegisterPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);	
	}

	
}
