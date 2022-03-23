Feature: Radiology menu block

  Scenario: MRT menu block
    Given user opens radiology page
    When the user clicks MRT in menu
    Then the user sees 9 sub items

  Scenario Outline: MRT menu items
    Given user opens radiology page
    When  the user clicks MRT in menu
    And   the user clicks the item "<item_index>"
    Then  the user gets the page named "<page>"
  Examples: Menu item table
      | item_index  | page  |
      |  1          | MRT01 |
      |  2          | MRT44 |