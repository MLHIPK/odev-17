Feature: AddPage User
@Test
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
@Test1
    Scenario: User update
      Given Click edit button
      When  Update email
      And   Update salary
      Then  Submit click button
