@sm
Feature:  Create a poll by clicking on Poll tab under Active Stream

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




