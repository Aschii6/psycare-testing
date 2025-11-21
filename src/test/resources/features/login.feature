@FR-002
@FR-004
Feature: User Login
  As a user,
  I want to login
  so that I can access my account securely.

  Scenario Outline: User Login
    Given the account database is
      | email                     | password         |
      | correct_email@example.com | correct_password |
    And the user has filled in the email with "<email>"
    And the user has filled in the password with "<password>"
    When they try to login
    Then the login is "<success_status>"
    Examples:
      | email                       | password           | success_status |
      | correct_email@example.com   | correct_password   | successful     |
      | incorrect_email@example.com | incorrect_password | unsuccessful   |
      | correct_email@example.com   | incorrect_password | unsuccessful   |
