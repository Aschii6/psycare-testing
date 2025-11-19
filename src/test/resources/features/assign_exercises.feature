@FR-062
Feature: Assign exercises
  As a psychologist,
  I want to assign exercises to clients or patients
  so that I enable structured therapeutic work between sessions.

  Scenario: Exercise assignment
    Given the psychologist has selected assignments and mapped clients and,or patients
    When they assign the exercises
    Then the assignment occurs
    And the assignments will appear for the clients and patients