@A-amazon
Feature: amazon
@S-01
Scenario Outline: Access Amazon
Given Launch "http://amazon.in"
And user Login "<username>" and "<password>"
When user clicks login
Then verify account home page
Examples:
|username|password|
|kulanthaivelnachiar@gmail.com|password1|
#----------------------------------------

