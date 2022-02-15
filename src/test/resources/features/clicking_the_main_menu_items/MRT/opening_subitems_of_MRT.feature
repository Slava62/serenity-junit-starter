Feature: MRT menu block

  Scenario: MRT menu block
    Given User clicks MRT in main menu
    When he is not registered
    Then MRT sub items is shown
    And  MRT blocks are shown on the page