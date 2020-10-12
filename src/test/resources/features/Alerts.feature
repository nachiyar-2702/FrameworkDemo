@A-SeleniumEasy/Test/Alerts
Feature: Alerts
Background: User launches SeleniumEasy Test Page for Alerts
Given user launches "https://www.seleniumeasy.com/test/" url to play around Alert
When user clicks Alerts Link
Then links under Alerts are displayed

@S-Alert-01
Scenario: Selenium Easy Test Page - Bootstrap Alerts
Given user clicks BootStrap Alerts 
When user taps on autoclosable success alert
Then user sees warning that are auto closable

@S-Alert-02
Scenario: Selenium Easy Test Page - Bootstrap Modals
Given user clicks BootStrap Modals
When user taps on single Modal Example
Then user sees Modal Window with options