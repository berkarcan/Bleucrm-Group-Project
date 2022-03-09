Feature: Task functionality

  BLEU-750 user story : As a user, I should be able to assign tasks under the Quick Navigate Menu

  Background:
    When the user logins with a valid username and password
    Then the user should be able to reach the dashboard page: "https://qa.bleucrm.com/stream/?login=yes"

  Scenario: High Priority
    When user click task button
    Then Verify that the high priority is visible
    When user click the high priority checkbox
    Then Verify that the checkbox is clickable

  Scenario: Visual Editor
    When user clicks visual editor
    Then verify that the editor text bar is displayed above the message box





