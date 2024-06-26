Feature: FAQ
  Scenario: Add FAQ data
    Given User is on the login page
    When User submit valid email and password
    Then User should be redirected to the Admin Dashboard
    And User click faq button
    Then User click add button
    And User fill the column
    Then User click save