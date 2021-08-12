Feature: Purchase a book on amazon.com
  I want to purchase a book of testing on amazon.com


  Scenario Outline: Purchase a book
    Given I visit the page amazon
    When I'm looking for a book
      | <nameBook> | <nameBookOptOne> | <nameBookOptTwo> | <assertOneAuthor> | <assertTwoSoldBy> | <assertThree> |
    Then I see two interesting books
    Examples:
      | nameBook             | nameBookOptOne                                 | nameBookOptTwo                           | assertOneAuthor | assertTwoSoldBy | assertThree |
      | Software Test Design | A practitioner's Guide to Software Test Design | Paperback tab was not shown pre-selected | Lee Copeland    | RAE global      | 0           |
