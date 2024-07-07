Feature: Login Page Feature 

Scenario: Login Page Title


Given user is on login page
When  user gets title of the page 
Then  page title should be "ParaBank | Welcome | Online Banking"

Scenario: Forgot password Link 

Given user is on login page 
Then  forgot password link  should be displayed 


Scenario: Login with correct credentials 

Given user is on login page 

When user enters username "dany1594"
And  user enters password "Danish@1594"
And  user clicks on login button 
Then user gets title of the page 
And  page title should be "ParaBank | Accounts Overview" 

 
