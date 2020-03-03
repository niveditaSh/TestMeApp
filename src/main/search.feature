Feature: Registered user Login
  @login1
  Scenario: Registered user login
    Given navigate to signin page1
   When user clicks on signin
    And User enters Username "Lalitha"
    And User enters Password "password123"
    And User clicks on Login
    When User clicks on search product textbox "bag"
    When User clicks on search button