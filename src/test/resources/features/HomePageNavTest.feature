Feature: Portico Overview Page Navigation

  @test1
  Scenario: Verify the Program Overview page
    Given I am navigating to the Portico Benefits and Services home page
    When I hover over the Overview tab
    Then I click the Program Overview link
    Then I verify that we arrived on the Program Overview page

    @test2
    Scenario: Verify the A Health Plan for Ministry page
      Given I am navigating to the Portico Benefits and Services home page
      When I hover over the Overview tab
      Then I click the Investing for Social Impact link
      Then I verify that we arrived the A Health Plan for Ministry page