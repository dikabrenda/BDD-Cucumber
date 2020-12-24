@Login
Feature: Login Feature
  
  As a user i want login to Jurnal.id
  so i can see jurnal homepage

  @2.1
  Scenario Outline: Verify user login feature
    Given User navigate to jurnal id
    And User enter username as <username> and password as <password>
    When User click sign in button
    Then User verify the <condition> in step

    Examples: 
      | username               	| password                 	| condition	        |
      | dikabrenda@outlook.com 	| 8SQVv/p9jVScEs4/2CZsLw== 	| loginSuccess      |
      | dikabrenda@outlook.com 	| 8D/NpYLiC+arNBHcGNcNpg== 	| passwordNotValid  |
      | dikabrend@outlook.com 	| 8SQVv/p9jVScEs4/2CZsLw== 	| emailNotValid	    |