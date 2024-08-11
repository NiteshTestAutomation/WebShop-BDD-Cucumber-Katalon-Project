@Login
Feature: Login feature

  @Valid
  Scenario Outline: Login with valid credentails
    Given User navigate to login page
    When User enters valid <username> and <password>
    And User click on login button
    Then User is navigated to homepage

    Examples: 
      | username                | password  |
      | niteshbadge@yopmail.com | nitesh123 |
