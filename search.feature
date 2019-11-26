Feature: Functionality testing of testMe application
Scenario: Search functionality
Given open the browser and land in signin page 
When user provides the valid credentials
And clicks on login button and lands back in home page
And Type the first four letters of the product
And  Select the product from the dropdown
And Click on find details
Then The product information is displayed
