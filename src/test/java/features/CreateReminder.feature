Feature: Create Reminder
  Scenario: As a user I should be able to create new reminder without alarm in Minimal Application. 
    Given User launch the app.
    And User is on Landing page.
    When User tap on new reminder icon.
    And User fill reminder name.
    And User tap on save icon.
    Then User see new reminder added on Landing page correctly.

  Scenario: As a user I should be able to create new reminder with alarm in Minimal Application. 
  	Given User launch the app.
    And User is on Landing page.
    When User tap on new reminder icon.
    And User fill reminder name.
    And User turn on toggle to set alarm.
    And User tap on save icon.
    Then User see new reminder added on Landing page correctly.
    And User see Date-Time alarm correctly.
