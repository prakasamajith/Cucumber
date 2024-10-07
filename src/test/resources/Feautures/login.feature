Feature: verify the login functionality

  @Reg
  Scenario Outline: verify the facebook login functionality with valid credentials
    Given user is on the facebook login page
    When user enters the "<username>" and "<password>"
    And user clicks on the login button
    Then user verify the after login success message

    Examples: 
      | username | password |
      | praka    | pass@124 |

  @Smoke
  Scenario Outline: verify the amazon login functionality with valid credentials
    Given user is on the amazon login page
    When user enters the "<username>" and "<password>" in amazon web
    And user clicks on the login button in amazon
    Then user verify the after login success message in amazon

    Examples: 
      | username         | password |
      | karthi@gmail.com | pass@124 |
