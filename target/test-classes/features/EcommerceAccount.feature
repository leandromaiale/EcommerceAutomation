@Smoke

Feature: Account
  As a user of the e-commerce website
  I want to use the functionalities corresponding to my account

  Background:
    Given I navigate to the login page
    When I select the Sign in option
    And Enter my username and password
    And Click on the Sign in session button

   Scenario: Successful login
    Then Login to my account
    And I select the button Sign out

  Scenario: Successful logout
    And I select the button Sign out
    Then The session is closed





