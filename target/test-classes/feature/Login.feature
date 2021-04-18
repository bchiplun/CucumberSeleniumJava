Feature: Application Login

@Tag1
Scenario: Home page default login
Given User is on netbanking landing page
When User logs in intgo application with username and password
Then Home page is populated
And Cards are displayed