Feature: Application signup

@Tag3
Scenario: Home page signup
Given User is on netbanking landing page
When User signsup with below details
| user1 | sirname1 | user1@gmail.com | India | 400708 |
Then He or She signs up successfully
And Users name is displayed