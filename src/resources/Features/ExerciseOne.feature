@GlobalTag
Feature: First Exercise
  @ScenarioTag
  Scenario Outline: To Verify the First Scenario
    Given Launch The Url
    When Handle The Cookie Consnet
    And Click The Parfum
#    And Select The '<Product type>'
#    And Choose The Brand '<brand>'
#    And Choose For Whom '<For Whom>'
#    And Select The '<Fragrance note>'
#    And Choose The Actions '<Actions>'
#    Then Verify The Filtered Results

    Examples:
      | Product type    | brand    | For Whom  | Fragrance note | Actions |
      | Eau de Parfum   | Givenchy | Female    | flowery        | Sale    |
#      | Eau de Toilette | Annayake | Masculine | fruchtig       | Sale    |