#Author: your.email@your.domain.com

@tag
Feature: To Add new customer from more data
  

  @tag1
  Scenario: To create new customer
    Given the user add new customer page
    
    When user enter the details  Customername and Gender and Date of Birth and  Address and City and State and PIN and Mobile Number and E-mail and Password|
    
      | Customername  | Gender | Date of Birth  | Address |City|State|PIN|Mobile Number|E-mail|Password|
      | cus1 |     M | 12-03-1999 | raj street | chennai|TN|613001|9876543210|sdfm@gmail.com|98765432|
      | cus2 |     F | 10-10-2000 | dd street |dubai|Bigar |620007|1234567890|shdhdh@gmail.com|8765432|
    
    And click the submit button
   
    Then user see the success message
    


