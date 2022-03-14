@ba
Feature:  Create a poll by clicking on Poll tab under Active Stream

  Background:
    When the user logins with a valid username and password
    Then the user should be able to reach the dashboard page: "https://qa.bleucrm.com/stream/?login=yes"
    And user clicks on poll tab

  Scenario: User adds multiple contacts from Employees and Departments contact lists
    When user clicks "Add more" and clicks Employees and Departments
    Then user can click to add 3 departments and 5 employees randomly

  Scenario Outline: User attaches a link or a text by clicking on the link icon
    When user clicks on link icon
    Then user can save text "<text>" or link "<link>"
    Examples:
      | text           | link         |
      | www.amazon.com |              |
      |                | www.ebay.com |

  Scenario: User adds  mention by clicking on the add mention icon
    When user clicks on add mention icon and clicks on Employees and Departments
    Then user can select an employee email randomly to mention

  @w
  Scenario: User adds multiple mentions by clicking on the add mention icon
    When user clicks on add mention icon and clicks on Employees and Departments
    Then user can select 3 employee emails randomly to mention


  Scenario Outline: User adds <n> questions with <clickAmount> more multiple answers
    When user clicks on "Add question" text to add question <n> times
    Then text boxes for n+1 questions and their answer boxes are displayed
    When user clicks on the last answer box of question <QuestionNUmber> <clickAmount> times
    Then new answer boxes added below the clicked last answer of question <QuestionNUmber>
    Examples:
      | n | QuestionNUmber |clickAmount|
      | 1 | 1              |2          |
      | 2 | 3              |3          |


  Scenario: User deletes questions and multiple answers
    When user clicks on "Add question" text to add question 4 times
    Then text boxes for n+1 questions and their answer boxes are displayed
    When user clicks on the last answer box of question 3 4 times
    And new answer boxes added below the clicked last answer of question 3
    Then user can delete 2 answers of question 3
    And user can delete the following questions with the numbers
      | 5 |
      | 3 |
      | 1 |
   ##1 denotes first question, 3 denotes third


  Scenario: User sends a poll  with multiple choices using the general functionalities in the preceding scenarios
    When user clicks "Add more" and clicks Employees and Departments
    Then user can click to add 2 departments and 4 employees randomly
    When user clicks on link icon
    Then user can save text "" or link "www.pollyjoly.com"
    When user clicks on add mention icon and clicks on Employees and Departments
    Then user can select 4 employee emails randomly to mention
    When user clicks on "Add question" text to add question 3 times
    Then text boxes for n+1 questions and their answer boxes are displayed
    When user allows multiple choices, insert questions and answers
    Then user can send the poll




