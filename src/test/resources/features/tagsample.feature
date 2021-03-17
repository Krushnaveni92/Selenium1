@FuntionalTest
Feature: Free CRM Application

//Scenario: Valid Login
//Given User is on Login Page

Background: Valid Login
Given User is on Login Page

Scenario: Invalid Login
Given User is on Login Page
When User Enter Invalid Credentials
@RegressionTest
Scenario: Create a Task
When User is on Task Page

Scenario: Create a deal
When User is on Deal Page
@SmokeTest @RegressionTest
Scenario: Create a Contact
When User is on Contact Page

Scenario: Create a Company
When User is on Company Page
@SmokeTest
Scenario: User Logout
When User click Logout

