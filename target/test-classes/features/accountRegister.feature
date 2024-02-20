Feature: Register an Account on Opencart Portal

Feature: Registration

  Scenario: Successful Registration with Valid Details
    Given the user is on the OpenCart landing page
    When the user navigates to the registration page
    And the user enters a valid first name "Janardhan"
    And the user enters a valid last name "Rane"
    And the user enters a valid email address "Janardhan.Rane@example.com"
    And the user enters a phone number in valid format "+1234567890"
    And the user enters a password "StrongPassword123!"
    And the user enters confirm password "StrongPassword123!"
    And the user selects "Yes" for the Subscribe option
    And the user checks the Privacy Policy checkbox
    When the user clicks the Continue button
    Then the "Your Account Has Been Created!" message is displayed
    And the user clicks the Continue button on account success page
    And the user is logged in and "My Account" should be displayed

