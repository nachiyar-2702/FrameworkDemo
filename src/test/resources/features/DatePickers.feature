@A-SeleniumEasy/Test/DatePickers
Feature: DatePickers
Background: User launches SeleniumEasy Test Page for Date PIcker
Given user launches "https://www.seleniumeasy.com/test/" url to check Date
When user clicks DatePickers Link
Then links under DatePickers are displayed

@S-01
Scenario: Selenium Easy Test Page - BootStrap Date Picker
Given user clicks bootstrap date picker
When user plays around the datepicker table
Then selected and cleared date 