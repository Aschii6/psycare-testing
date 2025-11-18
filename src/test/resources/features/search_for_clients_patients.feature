@FR-006
@FR-007
Feature: Client Patient Search
  As a psychologist,
  I want to search for clients or patients
  so that I can locate them in the system.

  Scenario Outline: Search
    Given the following clients patients exist in the system
      | name           | email              |
      | John Johnathan | jojo@j.com         |
      | Mike Ross      | mr@lawyer.com      |
      | John Johnathan | another_jojo@j.com |
    And the psychologist completes the relevant search criteria "<search_criteria>"
    When they initiate the search
    Then a list of users "<users>" is displayed
    Examples:
      | search_criteria                        | users                                                       |
      | name:John Johnathan                    | John Johnathan,jojo@j.com;John Johnathan,another_jojo@j.com |
      | name:John Johnathan & email:jojo@j.com | John Johnathan,jojo@j.com                                   |
      | email:mr@lawyer.com                    | Mike Ross,mr@lawyer.com                                     |
      | name:Harvey Specter                    | No records found                                            |