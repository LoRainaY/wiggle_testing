Feature: Individual Task

  Scenario: 01 Open main, click Your Account, click link Secured by SECTIGO,check first tab, return on main page, check link Your Account
    Given  Main page is loaded
    When click on link Your Account
    And Scrolling down to find the link Secured by SECTIGO
    And come back and check first tab
    And go to main page
    Then link Your Account is disabled
