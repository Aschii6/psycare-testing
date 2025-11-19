@FR-097
Feature: Session Payment Management
  As a psychologist,
  I want to record, track and link session payments to appointments
  so that I can easily manage my revenue.

  Scenario: Session Payment Creation
    Given there exists at least a session
    And the psychologist completes the relevant data for a new session payment
    When they create the session
    Then the session payment gets created
    And the session payment is linked to the session