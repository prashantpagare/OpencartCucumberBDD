package stepDefinations;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestContextSetup;

public class RegisterPageStepDefination {
	
	public TestContextSetup testContextSetup;
	
	public RegisterPageStepDefination(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}

	@When("the user enters a valid first name {string}")
	public void the_user_enters_a_valid_first_name(String firstName) {
		testContextSetup.registerPage.enterFirstname(firstName);
	
	}
	@When("the user enters a valid last name {string}")
	public void the_user_enters_a_valid_last_name(String lastName) {
		testContextSetup.registerPage.enterLastname(lastName);
	}
	
	@When("the user enters a valid email address {string}")
	public void the_user_enters_a_valid_email_address(String email) {
		String emailWithRandomPrefix = generateEmailWithRandomNumber(email);
		testContextSetup.registerPage.enterEmailAddress(emailWithRandomPrefix);
		
	}
	
	@When("the user enters a phone number in valid format {string}")
	public void the_user_enters_a_phone_number_in_valid_format(String phoneNo) {
		testContextSetup.registerPage.enterPhoneNumber(phoneNo);
		
	}
	
	@When("the user enters a password {string}")
	public void the_user_enters_a_password_meeting_complexity_requirements(String password) {
		testContextSetup.registerPage.enterPassword(password);
		
	}
	
	@When("the user enters confirm password {string}")
	public void the_user_enters_confirm__password(String confirmPassword) {
		testContextSetup.registerPage.enterConfirmPassword(confirmPassword);
		
	}
	@When("the user selects {string} for the Subscribe option")
	public void the_user_selects_for_the_subscribe_option(String string) {
		testContextSetup.registerPage.clickYesAsSubscribeNewsletter("Yes");
	}
	
	@When("the user checks the Privacy Policy checkbox")
	public void the_user_checks_the_privacy_policy_checkbox() {
		testContextSetup.registerPage.clickOnPrivacyPolicyCheckBox();
	}
	
	@When("the user clicks the Continue button")
	public void the_user_clicks_the_Continue_button() {
		testContextSetup.registerPage.clickOnContinueBtn();
	}
	

	private String generateEmailWithRandomNumber(String email) {
	    int atIndex = email.indexOf('@');
	    String username = email.substring(0, atIndex);
	    String domain = email.substring(atIndex);
	    Random random = new Random();
	    String randomNumber = String.format("%03d", random.nextInt(999)); // 3-digit random number
	    return username + randomNumber + domain;
	}

}
