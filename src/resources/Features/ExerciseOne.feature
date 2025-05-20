@GlobalTag
Feature: product filteration
  @ScenarioTag
  Scenario Outline: To Verify the product filter scenario
    Given Launch The Url
    When Handle The Cookie Consnet
    And Click The Parfum
    And Select The '<Producttype>'
    And Choose The Brand '<brand>'
    And Choose For Whom '<ForWhom>'
#    And Select The '<Fragrance note>'
    And Choose The Actions '<Actions>'
    Then Verify The Filtered Results

    Examples:
      | Producttype    | brand    | ForWhom  | Fragrancenote | Actions |
      | Eau de Parfum   | Givenchy | Unisex    | flowery        | Sale    |
      | Eau de Toilette | Annayake | Masculine | fruchtig       | Sale    |