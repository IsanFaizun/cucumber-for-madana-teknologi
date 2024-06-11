Feature: Admin Login
  Scenario: Successful login as admin with valid credentials
    Given User is on the login page
    When User submit valid email and password
    Then User should be redirected to the Admin Dashboard