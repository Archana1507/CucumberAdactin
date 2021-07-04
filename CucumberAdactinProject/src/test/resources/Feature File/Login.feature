@Login
Feature: To validate Adactinlogin functionality

  #Scenario: To validate Adactin  login using invalid credentials
  #
  #	Given User is in Adactin Login Page
  #	When User enter  invalid Username and Password
  #	And   User click Login button
  #	Then User should displayed with error message.
  Background: 
    Given User is in Adactin login Page
@sanity
  Scenario Outline: To validate Adactin login using different set of data
    When User enter invalid "<Username>" ,"<Password>"
    When User click login button
    Then User must validate the results based on "<Combination>"

    Examples: 
      | Username |  | Password |  | Combination |
      | ggkgh    |  |     1234 |  | negative    |
      | gkg      |  |     5678 |  | negative    |
      | Ayyappan |  | 23092001 |  | positive    |
@sanity @regression
  Scenario: To validate Adactin login without entering reuired credentials
    When User clik Login button
    Then User must be in invalid Credential page

  Scenario: To validate Adactin login using valid credentials
    When User enter valid username and password
      | username |  | Ayyappan |
      | password |  | 23092001 |
      And User click Login button
      Then User must displayed successful login
