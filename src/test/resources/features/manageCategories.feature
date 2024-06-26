Feature: Manage Project Categories

  Background:
    Given User is on the login page
    When User submit valid email and password
    Then User should be redirected to the Admin Dashboard

  Scenario: Create a new project category
    Given Admin on the categories management page
    When Admin click on the Tambah Kategori button
    And Admin fill the column
    Then Admin click Simpan button