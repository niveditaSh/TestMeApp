
    Feature: Registered user Login
    
    
  @login11
  Scenario Outline: Registered user login
    Given navigate to signin page1
   When user clicks on signin11
    And User enters Username1 "<usrnm123>"
    And User enters Password1 "<pwd123>"
    And User clicks on Login1
    When User clicks on search product textbox1 "<search111>"
    When User clicks on search button12
    Examples:
    |usrnm123|pwd123|	|search111|
    |Lalitha|password123|	|bag|