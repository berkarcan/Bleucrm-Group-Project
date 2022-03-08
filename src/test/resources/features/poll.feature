Feature:  Create a poll by clicking on Poll tab under Active Stream

  Background:
    When the user logins with a valid username and password
    Then the user should be able to reach the dashboard page: "https://qa.bleucrm.com/stream/?login=yes"
    And user clicks on poll tab

  Scenario: User adds multiple contacts from Employees and Departments contact lists
    When user clicks "Add more" and clicks Employees and Departments
    Then user can click to add 3 departments and 5 employees randomly
  @wip
  Scenario Outline: User attaches a link by clicking on the link icon
    When user clicks on link icon
    Then user can save text "<text>" or link "<link>"
    Examples:
      | text           | link         |
      | www.amazon.com |              |
      |                | www.ebay.com |

  Scenario: User adds  mention by clicking on the add mention icon

  Scenario: User adds questions and multiple answers

  Scenario: User deletes questions and multiple answers

  Scenario: User provides multiple choice to attendees by selecting the Allow multiple choice checkbox

  Scenario: User sends a poll
