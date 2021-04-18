Feature: Application Login

@WebTest
Scenario: Home page default login
Given User is on netbanking landing page
When User logs in intgo application with username "user1" and password "pass1"
Then Home page is populated
And Cards dispalyed is "true"

@WebTest
Scenario: Home page default login
Given User is on netbanking landing page
When User logs in intgo application with username "user2" and password "pass2"
Then Home page is populated
And Cards dispalyed is "false"

@MobileTest
Scenario: Home page default login
Given User is on netbanking landing page
When User logs in intgo application with username "mob1" and password "mob2"
Then Home page is populated
And Cards dispalyed is "false"

@MobileTest
Scenario Outline: Home page default login
Given User is on netbanking landing page
When User logs in in the application with username <Username> and password <Password>
Then Home page is populated
And Cards dispalyed is "true"

Examples:
|Username   |Password   |
|user1      |pass1      |
|user2      |pass2      |
|user3      |pass3      |