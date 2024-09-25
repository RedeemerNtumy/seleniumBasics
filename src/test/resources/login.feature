Feature: Login Functionality Feature
  In order to do Internet Banking
  As a valid Para Bank customer
  I want to login successfully


  Scenario Outline: Login Successful

    Given I am in the login page of the Para Bank Application
    When I enter valid <username> and <password>
    Then I should be taken to the Overview Page

    Examples:
      |username|password|
      |"autotester"|"password"|
      |"tautester" |"password"|
