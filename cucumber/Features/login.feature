Feature: Bookcart Application Test

  Scenario: Login Should be success
  
    Given user navigate to the bookcart application
    And user clicks in login button
    And user enter the username as ortoni
    And user enter the password as pass123
    When user click on the login button
    Then Login should be success
