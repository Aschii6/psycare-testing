@FR-034
Feature: Create Appointment
  As a psychologist,
  I want to create a new appointment
  so that i can schedule therapy sessions

  Background: Psychologist is logged into the app

  Scenario: Create Appointment Successfully
    Given the psychologist completed the appointment data and invited participants
    When they try to create the appointment
    Then the appointment is created successfully

  Scenario: Create Appointment Unsuccessfully
    Given the psychologist has not completed the appointment data or invited participants
    When they try to create the appointment
    Then ensure a rejection message is displayed
    But the appointment is not created
