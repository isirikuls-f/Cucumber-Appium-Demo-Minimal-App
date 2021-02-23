Feature: To verify UI of Minimal application.
  Scenario: As a user I should see app name at Title bar when I open application. 
  	Given User launch Minimal app.
    When The App is open.
    Then User see App Name at Title bar.

  Scenario: As a user I should be able to see version. 
    Given User launch Minimal app.
    When The App is open.
 		And User tap on more options in the right corner of the app.
 		And User select "About" on more options.
    Then User see app version on about page correctly.

  Scenario: As a user I should be able to see settings page. 
    Given User launch Minimal app.
    When The App is open.
 		And User tap on more options in the right corner of the app.
 		And User select "Settings" on more options.
    Then User see settings page correctly.
