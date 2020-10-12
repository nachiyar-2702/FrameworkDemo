@A-SeleniumEasy/Test/Table
Feature: Table
Background: User launches SeleniumEasy Test Page for Table
Given user launches "https://www.seleniumeasy.com/test/" url to play around Table
When user clicks Table Link
Then links under Table are displayed

@S-Table-01
Scenario: Selenium Easy Test Page - Table Pagination
Given user clicks Table Pagination
When user lands on pagination page clicks on next symbol
Then user goes to second page that has 15 records
And both prev and next buttons are enabled 

@S-Table-02
Scenario: Selenium Easy Test Page - Table Data Search
Given user clicks Table Data Search
When user types in term to search "John"
Then user sees results relevant to search term

@S-Table-03
Scenario: Selenium Easy Test Page - Table Data Filter
Given user clicks Table Data Filter
When user clicks Green
Then user sees results green value

@S-Table-04
Scenario: Selenium Easy Test Page - Table Sort
Given user clicks Table Sort
When user clicks Positionn column to Sort
Then user sees sorted results for position column

@S-Table-05
Scenario: Selenium Easy Test Page - Table Search
Given user is in table search sort page
When user enters search term "engineer" 
Then user sees relavant results for search term

@S-ProgressBar-01
Scenario: Selenium Easy Test Page - JQuery ProgressBar
Given user is in JQuery Page
When user taps on start download
Then user sees progress bar download complete

@S-DragAndDrop-01
Scenario: Selenium Easy Test Page - DrapAndDrop
Given user is in DragAndDrop Page
When user starts sliding
Then user capturs the last slide
