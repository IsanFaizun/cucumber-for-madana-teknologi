Feature: FAQ
  Scenario: Add FAQ data
    Given User is on the login page
    When User submit valid email and password
    Then User should be redirected to the Admin Dashboard
    And User click faq button
    Then User click add button
    And User fill the column
    Then User click save

  Scenario: Edit FAQ data (question)
    Given User is on the login page
    When User submit valid email and password
    Then User should be redirected to the Admin Dashboard
    And User click faq button
    Then User click edit button
    And User edit on question column
    Then User click save

  Scenario: Delete FAQ data
    Given User is on the login page
    When User submit valid email and password
    Then User should be redirected to the Admin Dashboard
    And User click faq button
    Then User click delete button
    And User click confirmation