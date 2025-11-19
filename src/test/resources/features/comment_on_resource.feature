@FR-107
Feature: PsyEd Resource Comment
  As a psychologist,
  I want to comment under a resource
  so that I can engage in professional exchanges.

  Background: Psychoeducational Resource Library

  Scenario: Comment Publication
    Given the psychologist is reading a psychoeducational resource
    And they wrote the comment they wish to leave
    When they publish the comment
    Then the new comment will appear in the comment section of the resource

  Scenario: Comment Response
    Given the psychologist is reading a psychoeducational resource
    And they select a comment to respond to
    And they wrote the response text
    When they publish the response
    Then the new response will appear under the comment