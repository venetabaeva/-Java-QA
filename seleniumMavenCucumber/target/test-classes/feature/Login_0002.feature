Feature: test scenario to test login logout for Travel Portal
Background: 
    Given I am on the travel portal "http://demo.guru99.com/test/newtours/index.php"
@tag1
  Scenario Outline: Login logout with different credentials
    When I type login = "a" and password = "a"
    And I click on sing-in button
    Then I shoud get "http://demo.guru99.com/test/newtours/login_sucess.php" link

    Examples: 
      | userName  | password      | link     |
      | a         | a             | SIGN-OFF |
      | b         |               | SIGN-ON  |
      | b         | wrongPassword | SIGN-ON  |
      | wrongUser | b             | SIGN-ON  |
      | wrongUser | wrongPassword | SIGN-ON  |
      | wrongUser |               | SIGN-ON  |
      |           | b             | SIGN-ON  |
      |           | wrongPassword | SIGN-ON  |
      |           |               | SIGN-ON  |
