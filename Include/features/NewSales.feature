@SalesInvoice
Feature: Create Sales Invoice
  
  As a user 
  I want to be sure create sales invoice in jurnal.id correctly

  @2.1.1
  Scenario: Dropdown existing customer on the list
    Given User on homepage with validID
    And User click sales
    And User click create new sale button
    And User select Sales Invoice button
    When User Select dropdown existing customer on the list
    Then User should be able to see existing customer on the list Successfully

  @2.1.2
  Scenario Outline: Dropdown customer with add new customer
    Given User on Create Sales Invoice Page with validID
    Then User Select dropdown customer and added new customer
    And User Enter Name <name>
    And User Enter Email <email>
    And User Enter Address <address>
    And User Enter Phone Number <phone>
    When User click save button
    Then User should be able added new customer Successfully

    Scenarios: 
      | name  			| email           			| address        									| phone        |
      | dikabrenda 	| dikabrenda@gmail.com 	| jl. Taman Narogong Indah no.11 	| 081210411618 |


  @2.2.1
  Scenario: Transaction date by inputting date
    Given User on Create Sales Invoice Page with validID
    And User click calendar on transaction date
    When User click date
    Then User should be able entered date successfully


  @2.2.2
  Scenario: Transaction date by selection date modal
    Given User on Create Sales Invoice Page with validID
    And User click Term
    When User select date modal
    Then User should be able entered by date modal successfully


  @2.3.1
  Scenario: Dropdown existing product on the list
    Given User on Create Sales Invoice Page with validID
    When User click product
    Then User should be able to see existing product on the list


  @2.3.2
  Scenario Outline: Dropdown customer with add new product
    Given User on Create Sales Invoice Page with validID
    And User click type to add button in select product
    And User enter name <name> and Product code <code>
    When User click save
    Then User should be able to added new product

    Scenarios: 
      | name 						| code   	|
      | Teh Kotak 090 	| 090 		|


  @2.3.3
  Scenario: Dropdown customer with add new product with selecting other buy account
    Given User on Create Sales Invoice Page with validID
    When User click add more data button
    Then User should be able to added another product


  @2.4.1
  Scenario: Input unit price
    Given User on Create Sales Invoice Page with validID
    When User enter unit price
    Then User should be able to enter price successful


  @2.5.1
  Scenario: Upload picture
    Given User on Create Sales Invoice Page with validID
    When User click browse in attachment and upload picture
    Then User uploaded picture successfully


  @2.6.1
  Scenario: Verifying sales invoice
    Given User on Create Sales Invoice Page with validID
    When User click create button
    Then User created sales invoice successfully
