@sm
Feature:  Use Services functionalities under Active Stream

  Background:
    When the user logins with a valid username and password
    Then the user should be able to reach the dashboard page: "https://qa.bleucrm.com/stream/?login=yes"


Scenario: As a user, I should be able to use "Services" functionality
Given user can see "Services" under Activity stream
When user enters "Ideas" page
Then user can suggest new idea

Scenario: User can sort the ideas
Given User clicks on Ideas page
When User can sort the ideas by date added
Then User can sort the ideas by rating

Scenario: User likes or dislike the idea
Given User likes "someones" idea
Then User dislikes "someones" idea

Scenario:  User can create new category by clicking "New category"
Given User clicks on new category
When User enters name of category
Then User saves it

Scenario: User can print the lists by clicking "Print"
Given User enter to Lists page
Then User clicks print button