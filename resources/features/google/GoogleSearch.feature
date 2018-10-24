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
@tag
Feature: Busqueda en Google
  	Quiero realizar una busqueda en Google

  @tag1
  Scenario: Realizar una busqueda en Google
    Given que lanzo el navegador
    When abro la pagina de inicio en Google
    Then busco "el tiempo mañana" y 12 en Google

  @navegador
  Scenario: Login App
    When abro la aplicacion en el navegador Firefox
