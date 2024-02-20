package stepDefinations;

import io.cucumber.java.en.Then;

import pageObjects.AccountSuccessPage;

import utils.TestContextSetup;


public class AccountSuccessPageStepDefination {
	
	public TestContextSetup testContextSetup;
	public AccountSuccessPage accountSuccessPage;
	
	public AccountSuccessPageStepDefination(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		
	}

	
	@Then("the {string} message is displayed")
	public void the_message_is_displayed(String successMsg) {
		accountSuccessPage = new AccountSuccessPage(testContextSetup.driver);
		accountSuccessPage.confirmSuccessMessage(successMsg);
	}
	
	@Then("the user clicks the Continue button on account success page")
	public void the_user_clicks_the_continue_button_on_account_success_page() {
		accountSuccessPage.clickOnContinueBtnOnSuccessPage();
	}
	
	
}
