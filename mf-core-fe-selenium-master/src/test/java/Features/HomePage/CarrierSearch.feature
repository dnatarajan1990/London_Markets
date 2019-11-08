Feature: HomePage
  As a Carrier
  I want To search for existing Risks using a Unique Market Reference (UMR), Insured Name and Reinsured Name
  So that  I can display the Risk Detail

  Background:
    Given the user has navigated to the home page as a Carrier

  Scenario: The 'New Claim' search page should be displayed when the carrier clicks on New Claim Button
    And the user has clicked on New Claim button
    Then the New Claim search page should be displayed
    And the Search label should be displayed

  Scenario Outline: The detailed result should be displayed if the Carrier search for valid input which has one result
    And the user has clicked on New Claim button
    When the user search the Risks for <SearchInput>
    And clicks on Search Button
    Then the UMR reference will be displayed
    And the start date will be displayed
    And the end date will be displayed
    Examples:
      | SearchInput  |
      | B0801WIL0012 |
      | George       |
      | Johnson      |

  Scenario Outline: The more detailed result will be displayed when the Carrier clicks on 'Show More' on the result
    And the user has clicked on New Claim button
    When the user search the Risks for <SearchInput>
    And clicks on Search Button
    And the user clicks on Show More button on the displayed result
    Then the Contract Name should be displayed
    And the Type should be displayed
    And the Treaty Faculative should be displayed
    And the Nature should be displayed

    Examples:
      | SearchInput  |
      | B0801WIL0012 |
      | George       |
      | Johnson      |

  Scenario: The multiple results will be displayed if the Carrier search for valid input which has multiple results
    And the user has clicked on New Claim button
    When the user search the Risks for Jack
    And clicks on Search Button
    Then number of results displayed should be 2

  Scenario Outline: An error message 'Insurances not found' should be displayed if the Carrier input search is invalid(Format and Access)
    And the user has clicked on New Claim button
    When the user search the Risks for <SearchInput>
    And clicks on Search Button
    Then the 'Insurances not Found' error message should be displayed
    Examples:
      | SearchInput  |
      | C01056587546 |
      | Mark         |