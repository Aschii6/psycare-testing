@FR-052
Feature: Psychologist view of Journal Entries
  As a psychologist,
  I want to see the journal entries of my clients or patients
  so that I can observe and evaluate their emotional state and progress.

  Scenario Outline: View Journal Entries
    Given the psychologist has "<user>" as a mapped client or patient
    When they open the client's or patient's journal history
    Then they can see the history of journal entries "<journal_history>"

    Examples:
      | user              | journal_history  |
      | Stephen the Great | journal_history1 |
      | Michael the Brave | journal_history2 |