@FR-041
Feature: Attendance Marking
  As a psychologist,
  I want to mark the attendance of planned sessions
  so that an accurate clinical history is maintained.

  Scenario Outline:
    Given the psychologist is looking at a past session
    And the session attendance is marked with "<attendance>"
    When they select the new attendance "<new_attendance>"
    Then the attendance of the session will be changed to "<new_attendance>"

    Examples:
      | attendance | new_attendance |
      | none       | completed      |
      | none       | missed         |
      | none       | rescheduled    |
      | completed  | missed         |