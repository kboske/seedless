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
Feature: Fruit list
  To make a great smoothie , I need some fruit
  Scenario: List fruit
    Given the system knows about the following fruit:
    | name | color |
    |banana | yellow |
    |strawberry|red|
    |orange|orange|
    |blackberry|black|
    |cherry|red|
    When the client requests GET /fruits
    Then the response should be JSON:
    """
    [{"name":"banana","color":"yellow"},
     {"name":"strawberry","color":"red"},
     {"name":"orange","color":"orange"},
     {"name":"blackberry","color":"black"},
     {"name":"cherry","color":"red"}
    ]
    """

#  Scenario Outline: Title of your scenario outline
#    Given I want to write a step with <name>
#    When I check for the <value> in step
#    Then I verify the <status> in step
#
#    Examples: 
#      | name  | value | status  |
#      | name1 |     5 | success |
#      | name2 |     7 | Fail    |