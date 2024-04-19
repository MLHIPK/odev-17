Feature: Button Click
  @buttons_click
  Scenario: Success page open
    Given  I open Demo page
    When  I push the buttons
    And  I push the click me buttons
    Then Read click text

  @Insert
  Scenario: Success user add
    Given I open Demo page2
    When  I push the add buttons
    And   Firstname input
    And   Lastname input
    And   Email input
    And   Age input
    And   Salary input
    And   Depart input
    Then  Submit click

  @Update
  Scenario: User update
    Given Click edit button
    When  Update email
    And   Update salary
    Then  Submit click button
