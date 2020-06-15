Feature: Test the facebook login feature

@Regression
Scenario: Test the login

Given Browser is open
And the application is loaded
When user enters the username and password
|username|password|
|chandsaritha|jesus|
|chandsaritha123|jesus123|
And user clicks on login button
Then The Homepage should be displayed






#Scenario: Test the login

#Given Browser is open
#And the application is loaded
#When user enters the username and password
#|chandsaritha|jesus|
#And user clicks on login button
#Then The Homepage should be displayed





#Scenario Outline: Test the login

#Given Browser is open
#And the application is loaded
#When user enters the "<username>" and "<password>"
#And user clicks on login button
#Then The Homepage should be displayed

#Examples:
#|username|password|
#|chandsaritha|test1|
#|test2|test3|




#Scenario: Test the login

#Given Browser is open
#And the application is loaded
#When user enters the "username" and "password"
#And user clicks on login button
#Then The Homepage should be displayed






#Feature: Test the facebook login feature

#Background:
#Given Browser is open
#And the application is loaded


#Scenario: Test the login
#When user enters the username
#And user enters the password
#And user clicks on login button
#Then The Homepage should be displayed

#Scenario: Test Forgotten Account
#When user clicks on forgotten Account button
#Then Find your account page should be displayed


