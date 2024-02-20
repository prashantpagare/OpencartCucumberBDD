package stepDefinations;


import io.cucumber.java.en.Then;
import pageObjects.MyAccountPage;
import utils.TestContextSetup;


public class MyAccountPageStepDefination {
	
	public TestContextSetup testContextSetup;
	public MyAccountPage myAccountPage;
	
	public MyAccountPageStepDefination(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;	
	}
	
	
	@Then("the user is logged in and {string} should be displayed")
	public void the_user_is_logged_in_and_should_be_displayed(String msg) {
		 myAccountPage = new MyAccountPage(testContextSetup.driver);
		 myAccountPage.myAccountTitleShouldBeDisplayed(msg);
		 		 	
	}

}
