package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.LandingPage;
import pageObjects.PageObjectManager;
import pageObjects.RegisterPage;

public class TestContextSetup {
	
	public WebDriver driver;
	public LandingPage landingPage;
	public RegisterPage registerPage;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	
	public TestContextSetup() throws IOException {
		testBase = new TestBase();
		pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
	}
	

	
	

}
