Feature: Testing functionality for testMe app
Scenario: Register to TestMe app
Given User opened the testme app and landed in the signup page
When User enters the username as "krishnatejurajuuuu" 
And  User enters the first name as "Naveen"
And User provides second name as "Teju"
And User enters the password as "tejuuu97"
And User confirms the password as "tejuuu97"
And User selects the Male
And User provides the mailid "naveenteju855@gmail.com"
And User enters the mobilenum "7338337030"
And User enters the dob "11/29/1997"
And User enters his city "bengaluru"
And User selects the Security question
And User provides the answer as "chennai" for the question
And Click on Register button
Then User Registered succesfully 