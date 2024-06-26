Feature: Manage Project Categories

  Background:
    Given User is on the login page
    When User submit valid email and password
    Then User should be redirected to the Admin Dashboard

  Scenario: Create a new project category
    Given Admin on the categories management page
    When Admin click on the Tambah Kategori button
    And Admin fill the column with "Dummy Mobile"
    Then Admin click Simpan button
#    And Admin logout

  Scenario: Edit an existing project category
    Given Admin on the categories management page
    When Admin click edit button on one of existing category
    And Admin fill the column with "Dummy Web"
    Then Admin click Simpan button

  Scenario: Delete an existing project category
    Given Admin on the categories management page
    When Admin click delete button on one of existing category
    And Delete confirmation appears
    Then Admin click Hapus button