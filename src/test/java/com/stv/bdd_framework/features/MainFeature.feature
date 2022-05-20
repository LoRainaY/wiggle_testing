Feature: Load Account page

  Scenario Outline: #01 Filling in the login information
    Given  the login page is loaded
    When user enters "<email>"
    And enters "<password>"
    And clicks on Sign in securely button
    Then user goes to the account page
    Examples:
      | email            | password |
      | zaiada@gmail.com | 123456   |

