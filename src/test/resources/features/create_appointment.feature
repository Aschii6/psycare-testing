@FR-034
Feature: Create Appointment
  As a psychologist,
  I want to create a new appointment
  so that i can schedule therapy sessions

  Background: Psychologist is logged into the app

  Scenario: Create Appointment
    Given the psychologist completed the appointment data
    And the psychologist invited clients, patients, or both to participate
    When they try to create the appointment
    Then the appointment is created