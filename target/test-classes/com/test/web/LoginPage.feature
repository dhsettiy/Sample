
Feature: adactinhotel automation testing
  I want to use this template for my feature file

  Scenario: Login AdactinHotel
    Given Open adactinHotel Browser
    When enter userName 
    And enter passWord
    And click loginButton
    And Select Location
    And Select Hotel Name
    And select room type
    And update number of rooms requires
    And update check-in date
    And update check-out date
    And update adults per rooms
    And update child per rooms
    And click search button
    And select the radio button option
    And click continue
    And enter your firstName
    And enter your lastName
    And enter your billing address
    And enter your credit card details
    And select credit card type
    And select Expiry date of credit card
    And enter cvv number
    And click bookNow button
    Then validate homePage
    
