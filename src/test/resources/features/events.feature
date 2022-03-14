Feature: Creating events from event tab

  Scenario Outline: User adds start and end time while specifying timezone

    Given the user is on the events page
    When the user enters <"event name"> and <"message">
    And the user enters <"start date">, <"start time"> and <"end date">, <"end time">
    And the user sets a reminder
    And the user should be able to select <"event location">
    And the user specifies <"timezone"> for start and end date
    And the user adds <"attendee">
    And the user clicks on More dropdown
    Then the parameters "Availability", "Repeat", "Calendar" and "Importance" should be displayed
    And the user should be able to create event send a message

    Examples:

      | "event name"          | "message"      | "start date" | "start time" | "end date"   | "end time" | "event location"       | "timezone"          | "attendee"                |
      | "sales meeting"       | "qa message 1" | "02/04/2022" | "09:30 am"   | "02/04/2022" | "11:30 am" | "East Meeting Room"    | "America/Menominee" | "hr56@cybertekschool.com" |
      | "review meeting"      | "qa message 2" | "12/06/2022" | "00:30 pm"   | "12/06/2022" | "05:30 pm" | "West Meeting Room"    | "America/Guyana"    | "hr34@cybertekschool.com" |
      | "negotiation meeting" | "qa message 3" | "09/05/2022" | "10:30 am"   | "09/05/2022" | "01:30 pm" | "Central Meeting Room" | "America/Chicago"   | "hr97@cybertekschool.com" |

  @yunus

  Scenario Outline: User tries to create an event with a past date

    Given the user is on the events page
    When the user enters <"event name"> and <"message">
    And the user enters <"start date">, <"start time"> and <"end date">, <"end time">
    Then the user should not be able to create event

    Examples:

      | "event name"   | "message"         | "start date" | "start time" | "end date" | "end time" |
      | "sales meeting"  | "qa invalid event1" | "02/05/2013"   | "09:30 am"     | "02/05/2013" | "11:30 am"   |
      | "review meeting" | "qa invalid event2" | "12/04/2011"   | "09:00 am"     | "12/04/2011" | "10:30 am"   |














