Feature: Registration fill up test
  @sanityTest
    @End2EndTest
  Scenario: User should be able to fill up registration from
    Given User in a Home Page

    When User click on Register link
    Then user should fill up the from with their information
