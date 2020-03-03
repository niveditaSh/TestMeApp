#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: User Registration


  @tag1
  Scenario: Register a new user
    Given Navigate to register page
    When user clicks on signup
    And user enters usrname "niv4i"
    And user enters fname "nivedita"
    And user enters lname "sarode"
    And user enters pwd "qwertyuiop12"
    And user enters cnfpwd "qwertyuiop12"
    And user selects gender
    And user enters mail "qwe@gmail.com"
    And user enters mbno "0123654789"
    And user enters dt "05/09/1998"
    And user enters addr "kdhxfgsmkgnhsg"
    And user selects a security question
    And user enters ans "abc"
    Then user clicks on register 
   