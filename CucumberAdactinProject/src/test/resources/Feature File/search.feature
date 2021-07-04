@search
Feature: To validate Search functionality



@smoke
  Scenario Outline: To validate Search and Booking Hotel using valid credentials
    Given User is in  Login Page
    And User enter "<Username>" ,"<Password>"
    When User click Login
    When User is in search page, User enter details for hotel search
    And User click search button,User click Radio button and click continue
    Then User book the hotel by filling "<firstname>" ,"<lastname>","<address>"
    And User pay amount using "<cc_num>" ,"<cvv>","<ccType>","<month>","<year>"
    And User click booknow button and id number is generated

    Examples: 
      | Username     |  | Password   |  | firstname |  | lastname |  | address |  | cc_num           |  | cvv |  | ccType |  | month |  | year |  
      | ArchanaLachu |  | 9994906957 |  | archana   |  | lachu    |  | chennai |  | 4756949674876456 |  | 789 |  | VISA   |  | July  |  | 2024 |  
