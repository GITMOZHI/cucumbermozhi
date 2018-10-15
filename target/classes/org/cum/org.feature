@tag
Feature: To Test new customer function
 

 

  @tag2
  Scenario Outline: Add customer
    Given the user is in guru login page
    And the user login and navigates to add customer page
    When user enter the customer details "<Customername>","<Gender>" ,"< Date of Birth>","<Address>","< City>","<State>","<PIN>","<Mobile Number>","<E-mail>","<Password>" 
    And user clicks the reset button
    Then the user should be in customer page

    Examples: 
      | Customername  | Gender | Date of Birth  | Address    |City    |State|PIN    |Mobile Number|E-mail     |Password|
      | cusa          |     M  | 12-03-1999     | raj street | chennai|TN    |613001|9876543210|sdfm@gmail.com|98765432|
      | cusb          |     F  | 10-10-2000     | dd street  |dubai   |Bigar |620007|1234567890|shdhdh@gmail.com|8765432|
