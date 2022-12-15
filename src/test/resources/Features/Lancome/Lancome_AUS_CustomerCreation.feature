@Customer_Creation
Feature: Customer creation

  @smoke @positive @mani-1
  Scenario: Verify if user is able to create a new customer with only mandatory fields
    Given User launches the Application
    Then User select the Country
    And User click on proceed button
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    And User click the Create button on Customer search
    Then Verify the Create new member page
    And User enter the First Name "TestA"
    And User enter the Last Name "TestTt"
    And User select the Date "3" and Month "February" and Year "1993" on DOB
    And User select Gender "Male"
    And User enter the Email address "testnew2@gmail.com"
    And User enter the Phone number "9876543212"
    And User click on Email marketing preferences
    When User click the join button
    Then Verify the Customer was created successfully

  @smoke @positive @mani-2
  Scenario: Verify if user is able to create a new customer with all fields
    Given User launches the Application
    Then User select the Country
    And User click on proceed button
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    And User click the Create button on Customer search
    Then Verify the Create new member page
    And User enter the First Name "TestA"
    And User enter the Last Name "TestTt"
    And User select the Date "3" and Month "February" and Year "1993" on DOB
    And User select Gender "Male"
    And User enter the Email address "testnew2@gmail.com"
    And User enter the Phone number "9876543212"
    And User enter the street number "10"
    And User enter the street name "test"
    And User enter the city name "testcity"
    And User select the state "Queensland"
    And User click on Email marketing preferences
    When User click the join button
    Then Verify the Customer was created successfully

  @smoke @negative @mani-3
  Scenario: Verify if user is able to create a new customer with invalid details
    Given User launches the Application
    Then User select the Country
    And User click on proceed button
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    And User click the Create button on Customer search
    Then Verify the Create new member page
    And User enter the street number "10"
    And User enter the street name "test"
    And User enter the city name "testcity"
    And User select the state "Queensland"
    When User click the join button
    Then Verify the mandatory fields are highlighted in red

  @smoke @negative @mani-4
  Scenario: Verify if user is able to create a new customer without filling details
    Given User launches the Application
    Then User select the Country
    And User click on proceed button
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    And User click the Create button on Customer search
    Then Verify the Create new member page
    When User click the join button
    Then Verify the mandatory fields are highlighted in red
