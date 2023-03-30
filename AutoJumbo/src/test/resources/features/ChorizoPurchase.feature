Feature: Shopping on the Jumbo Stores
  As: Potential Chorizo buyer
  I want: To buy the cheapest Chorizo
  So that

  Background: I am on the home page
    Given I went to Jumbo home page
    And I logged in
    And I selected my address
    When I am looking for Chorizo
    Then I will be redirected to the checkout page

  @OneChorizo
  Scenario: One Chorizo
    And I select the cheapest Chorizo

  @MoreChorizos
  Scenario Outline: More than one Chorizo
    And I select <quantity> of the cheapest and <sQuantity> of the second cheapest Chorizo
    Examples:
      | quantity | sQuantity |
      | 1        | 1         |
      | 1        | 2         |
      | 2        | 1         |