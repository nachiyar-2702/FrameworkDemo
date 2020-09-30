@A-SeleniumEasy/Test
Feature: InputForms
Background: User launches SeleniumEasy Test Page
Given user launches "https://www.seleniumeasy.com/test/" 
When user clicks InputForms Link
Then links under InputForms are displayed

@S-01
Scenario: Selenium Easy Test Page - Radio Button Demo
Given user clicks radio button demo
When user clicks radio button and click get checked value
Then selected radio text  is displayed

@S-02
Scenario: Selenium Easy Test Page - Two Radio Button Demo
Given launch "https://www.seleniumeasy.com/test/" and go to radio button demo
When user clicks radio buttons and click get values
Then selected radio texts  are displayed

@S-03
Scenario: Selenium Easy Test Page -  Demo
Given launch "https://www.seleniumeasy.com/test/" and go to dropdown demo
When user select single value "Saturday"
Then selected dropdown texts  are displayed

@S-04
Scenario: Selenium Easy Test Page -  Demo
Given user is in dropdown demo page
When user select multiple value "New York" and "New Jersey"
Then multiple dropdown texts are displayed

@S-05
Scenario: Selenium Easy Test Page - Input Form Submit
Given user is in Input Form Submit page
When user select provides values in all fields 
|First Name| |Last Name| |E-Mail| |Phone #| |Address| |City| |Zip Code| |State|
|Kula| |Nac| |abc@xyz.com| |1234567890| |Chennai Selaiyur| |Chennai| |600073| |California|
Then user clicks send button to submit 

@S-06
Scenario: Selenium Easy Test Page - Ajax Form Submit
Given user is in Ajax Form Submit Page
When user enter values in all fields and clicks Submit
|Nach| 
|For Test|
Then submitted message displays

@S-07
Scenario:  Selenium Easy Test Page - JQuery Select Dropdown
Given user is in JQuery select dropdown page
When user enters a value "A" and select dropdown
Then country is selected

@S-08
Scenario:  Selenium Easy Test Page - JQuery Select Dropdown2
Given user is in JQuery select dropdown page
When user selects dropdown from State "Arizona" and "California"
Then state is selected

@S-09
Scenario:  Selenium Easy Test Page - JQuery Select Dropdown3
Given user is in JQuery select dropdown page
When user selects dropdown from files "C"
Then files is selected
