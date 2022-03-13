Feature:  As a user, I should be able to use Filter and search functionality on Active Stream

  @wip
  Background:
    Given the user logins with a valid username and password
    When the user should be able to reach the dashboard page: "https://qa.bleucrm.com/stream/?login=yes"
    And the user clicks on the filterAndSearch button

  @wip
  Scenario : User should be able to see default filters
    Then the user should see defaults filters on the search page
      | WORK          |
      | FAVORITES     |
      | MY ACTIVITY   |
      | ANNOUNCEMENTS |
      | WORKFLOWS     |


  Scenario Outline: User should be able to add and remove field
    And the user clicks on the "Add field" button and remove "<fields>" field
    And the user clicks on the "Add field" button and add "<fields>" field
    Then the user should see the fields are selected
    Examples:
      | fields    |
      | Date      |
      | Type      |
      | Author    |
      | To        |
      | Favorites |
      | Tag       |
      | Extranet  |


  Scenario Outline: User should be able to restore default field
    And the user clicks on the "Add field" button and add "<fields>" field
    Then the user click on "Restore default fields" button and see default "<defaultFields>" on the search page
    Examples:
      | defaultFields |fields|
      | Date          |Date  |
      | Type          |Type  |
      | Author        |Author|
      | To            |Favorites|
      |               |Tag      |
      |               |Extranet |

  Scenario Outline: User should be able to reset filters to default
    And the user clicks on "Configure filter" button and removes filters
    Then the user resets buttons and see default "<filters>" on the search page
    Examples:
      | filters       |
      | WORK          |
      | FAVORITES     |
      | MY ACTIVITY   |
      | ANNOUNCEMENTS |
      | WORKFLOWS     |