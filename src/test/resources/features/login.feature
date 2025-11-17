@FR-002
@FR-004
Feature: User Login
  As a user,
  I want to login
  so that I can access my account securely.

  Scenario Outline: User Login
    Given the user has filled in the email
    And the user has filled in the password
    When they try to login with "<email>" and "<password>"
    Then the login is "<success_status>"
    Examples:
      | email                       | password           | success_status |
      | correct_email@example.com   | correct_password   | successful     |
      | incorrect_email@example.com | incorrect_password | unsuccessful   |
