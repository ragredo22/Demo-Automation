Feature: review incidents
  I want check out the incidents on USD, for the manage


  Scenario Outline: Manage incidents
    Given I visited on USD
    When I am manage the incidents
      | <userName> | <passWord> |
    Then quality the incidents
    Examples:

      | userName | passWord         |
      | ragredo  | JuanDavid270817* |
