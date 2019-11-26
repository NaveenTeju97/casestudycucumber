Feature: Functionality testing of testme
Scenario: Search functionality
Given Open the browser and land in signin page 
When User provides the valid credentials
And Clicks on login button and lands back in home page
And Type the product name
And Clicks on find details
And The product's information is displayed
And click on add to cart
Then checks if page lands in add to cart 