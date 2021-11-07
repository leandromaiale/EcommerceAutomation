Feature: Search anything in google
  Scenario: Search in google
    Given Navigate to Google
    When Login a word
    Then Assert results