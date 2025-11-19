@FR-048
Feature: Mood Selection
  As a client or patient,
  I want to mark my mood while recording journal entries
  so that my psychologist can easily track and analyse emotional history.

  Background: The client or patient is recording a journal entry

  Scenario Outline: Mood Selection
    Given the list of possible moods
      | happy   |
      | sad     |
      | neutral |
    And the client or patient is recording a journal entry
    When they select the mood "<mood>"
    Then the mood "<mood>" gets saved for the corresponding journal entry

    Examples:
      | mood    |
      | happy   |
      | neutral |
