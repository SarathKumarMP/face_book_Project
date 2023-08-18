Feature: Test the Insta Application
@smoketest1
Scenario: Check Login Functionalities
	Given launch the Insta Application URL
	When user Enter the User name in the InputField
	And user Enter the Password in the InputField
	Then user Clicks on the Login button and Navigate to User HomePage
	But user Click Forgotten Password Navigate to Forgot Password Page

Scenario: Create a New account in User
Given user click Create account button
When user Enter the Firstname in the InputField 
And user Enter the Surname in the InputField
And user Enter the Mobile or EmailNum in the Field
And user Enter Own Password in the Filed
And user Click on date birth in this dropdown field
And user Select the gender in the field
Then user Click signup button and navigate the User Homepage

