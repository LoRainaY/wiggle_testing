Feature: Load Air Home page

  Scenario: #01 Filling in the login information
    Given  the page is loaded
    When user enters email
    And enters password
    And clicks on Sign in securely button
    Then user goes to the main page
