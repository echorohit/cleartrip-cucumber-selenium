@book @flight
Feature: Booking

  Scenario: Book a flight
    Given the user navigates to cleartrip homepage
    When user selects a flight from "Pune" to "Bangalore" "5" days from today
    And user selects no of adults as "2"
    And user searches for flight
    And user books a flight