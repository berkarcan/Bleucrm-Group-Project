@addnews
Feature:  user should be able to add news under Company
@test1
  Scenario: User should be able to select the type of information under preview text
    Given the user is on the company page
    When the user enters the add news page
    Then User should be able to select the type of information under preview text

@test2
  Scenario: User should be able to select Text, HTML, and Visual Editor
    Given the user is on the company page
    When the user enters the add news page
    Then User should be able to select Text, HTML, and Visual Editor

  @test3
  Scenario: User should be able to send news
    Given the user is on the company page
    When the user enters the add news page
    Then User should be able to send news