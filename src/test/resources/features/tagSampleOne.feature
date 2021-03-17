@EndtoEndTest
Feature: Google page Test

Scenario: Search Java Text
Given User Search Java Text

@SmokeTest
Scenario: Search Selenium Text
Given User Search Selenium Text

@RegressionTest
Scenario: Search Cucumber Text
Given User Search Cucumber Text
Then should dispaly Selenium Text