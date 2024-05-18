@login
Feature: Login feature.

Scenarios: Verify valid login.

Given launch application
When enter username
And enter password
And click on submit btn
Then verify is user successfully logged in

#Scenarios: Verify invalid user login.
#Given launch application
#When enter invalid username
#And enter invalid password
#And click on submit btn
#Then verify user not logged in