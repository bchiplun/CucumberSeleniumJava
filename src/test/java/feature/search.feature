Feature: Search and add items to cart

@Selenium1
Scenario: Search a vegetable and check if it is displayed
Given User is on Greenkart home page
When User seach "Cucumber" in search box
Then "Cucumber" is displayed on the page


@Selenium2
Scenario: Search a vegetable and add to cart and check if it is displayed
Given User is on Greenkart home page
When User seach "Brinjal" in search box
And User adds the vegetable into cart
And User goes to cart page
Then "Brinjal" is displayed on the cart page