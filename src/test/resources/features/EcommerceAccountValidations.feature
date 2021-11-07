@Smoke

Feature: Account Validations
  As a user of the e-commerce website.
  I want to verify that field validations are generated correctly.

  Background:
    Given I navigate to the login page
    When I select the Sign in option

  Scenario: Login without password
    And I fill in the mail field
    Then A password validation is generated

  Scenario: Login without email
    And I fill in the password field
    Then A email validation is generated

  Scenario: Login without wrong email
    And  I fill in the email and password field with an incorrect values
    Then An authentication validation is generated

  Scenario: Login without wrong password
    And I fill in the mail field
    And I fill in the password field with an incorrect value
    Then An authentication validation is generated






