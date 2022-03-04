Feature: Purchase a book on amazon.com
  I want to purchase a book of testing on amazon.com
  @Managed
  WebDriver driver;


  Scenario Outline: usurios
    Given I ingreso URL
      | <nameBook> | <nameBookOptOne> |
    When login e inscripcion
    Then creo el usuario
    Examples:
      | nameBook | nameBookOptOne |
      | ssss     | sddd           |


