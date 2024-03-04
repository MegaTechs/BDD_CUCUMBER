Feature:
  #@SmokeTest
  Scenario: new Successful Login with Valid Credentials
    Given new User is on Home Page
    And Then user need to click on Registration button
    When new  User enters UserName and Password
    Then new  Message displayed Login Successfully
    Then we can see the success Message

