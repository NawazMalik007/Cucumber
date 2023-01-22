Feature: Validation of Login page in adactin web application

  Background: 
    Given User launch adactin web Application

  Scenario: Tc01_Validation of order id page with valid username  and valid password
    When User enters valid Username  and valid password
    And User clicks login button
    Then User verify Hotel page is displayed
    When User selects preferred location, Hotel,Room type,Number of rooms,Adults per Room,Children per Room
    When User enters Check In Date
    When User enters Check Out  Date
    And User clicks Search button
    Then User verify  Select Hotel page is displayed
    And User clicks Select radio  button
    And User clicks Continue button
    Then User verify  Book a hotel page is displayed
    When User enters First Name,Last  Name,Billing Address  Name
    When User enters Credit Card No.
    When User selects   Credit Card Type,Expiry Date by selecting month and year,CVV Number
    And User clicks Book now  button
    Then User verify  Hotel booking confirmation page is displayed with order number

  Scenario Outline: Tc02__Validation of order id page with multiple selections
    When User enters valid "<Username>"  and valid "<password>"
    And User clicks login button
    Then User verify Hotel page is displayed
    When User selects preferred "<location>", "<Hotel>","<Room type>","<Number of rooms>","<Adults per Room>","<Children per Room>"
    When User enters Check In Date
    When User enters Check Out  Date
    And User clicks Search button
    Then User verify  Select Hotel page is displayed
    And User clicks Select radio  button
    And User clicks Continue button
    Then User verify  Book a hotel page is displayed
    When User enters "<First Name>","<Last Name>","<Billing Address>"
    When User enters "<Credit Card No>" , selects   "<Credit Card Type>",Expiry Date by selecting "<expmonth>" and "<expyear>",enters "<Cvv Number>"
    And User clicks Book now  button
    Then User verify  Hotel booking confirmation page is displayed with order number

    Examples: 
      | Username     | password    | location  | Hotel          | Room type    | Number of rooms | Adults per Room | Children per Room | First Name | Last Name | Billing Address | Credit Card No   | Credit Card Type | expmonth | expyear | Cvv Number |
      | nawazsheriff | sheriff@123 | Sydney    | Hotel Creek    | Standard     | 1 - One         | 1 - One         | 1 - One           | Nawaz      | Sheriff   | Chennai         | 1234432112344321 | American Express | January  |    2019 |       9090 |
      | nawazsheriff | sheriff@123 | Melbourne | Hotel Sunshine | Double       | 2 - Two         | 2 - Two         | 2 - Two           | Mohammed   | fathima   | athur           | 9870098778909870 | VISA             | February |    2012 |       5678 |
      | nawazsheriff | sheriff@123 | Brisbane  | Hotel Hervey   | Deluxe       | 3 - Three       | 3 - Three       | 3 - Three         | Azmin      | Zarah     | tuticorin       | 7654231289002244 | Master Card      | March    |    2017 |       9101 |
      | nawazsheriff | sheriff@123 | Adelaide  | Hotel Cornice  | Super Deluxe | 4 - Four        | 4 - Four        | 4 - Four          | Samshiya   | Bhegam    | thirunelveli    | 6543218765432178 | Other            | April    |    2014 |       7865 |
