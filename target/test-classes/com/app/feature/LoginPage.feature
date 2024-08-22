@tag
Feature: Esspes Practice Registration form

Background:
  Given login to the application

  @asList
  Scenario: Validate username and password
    When Enter the values present in the form
      | Dharunya               |
      | Settiyannan             |
      | dharunya.settiyannan@gmail.com |
      |7070799316|
      |Java and Selenium              |
      |3/534, om sakthi street, rasipuram(tk), Namakkal(dt), 636203|
  

