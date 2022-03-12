@wip
Feature: Task functionality

#  BLEU-750 user story : As a user, I should be able to assign tasks under the Quick Navigate Menu

  Background:
    When the user logins with a valid username and password
    Then the user should be able to reach the dashboard page: "https://qa.bleucrm.com/stream/?login=yes"
    When user click task "task" button

  @test1
  Scenario: High Priority
    Then Verify that the high priority is visible
    When user click the high priority checkbox
    Then Verify that the checkbox is clickable

  @test2
  Scenario: Visual Editor
    When user clicks visual editor
    Then verify that the visual editor messagebox is displayed

  @test3
  Scenario: Checklist
    When user clicks checklist
    Then verify that the checklist text is displayed on the top
    When user enter some words or sentences in the input box
    Then user click the add button or checkmark

  @test4
  Scenario: Separator Lines
    When user clicks checklist
    Then verify that the checklist text is displayed on the top
    When user enter some words or sentences in the input box
    Then user click the add button or checkmark
    When user clicks separator
    Then user can see the separator lines between checklist items.


