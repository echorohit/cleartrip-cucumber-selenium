@book @flight
Feature: Smoke

  Scenario: claim a mobile
    Given the user navigates to cleartrip homepage
    When user books a flight from "Pune" to "Bangalore"
    And user selects the departure date as "23/01/2014"


