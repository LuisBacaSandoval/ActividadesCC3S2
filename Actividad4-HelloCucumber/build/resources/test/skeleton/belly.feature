Feature: BellyFeature

    Scenario: I ate 12 cakes and waited 3 hours
      Given I have eaten 12 cukes
      When I wait 3 hour
      Then my belly should growl

    Scenario: I ate 13 cakes and waited 1 hours
      Given I have eaten 13 cukes
      When I wait 1 hour
      Then my belly should not growl

    Scenario: I ate 10 cakes and waited 2 hours
      Given I have eaten 10 cukes
      When I wait 2 hour
      Then my belly should not growl

    Scenario: I ate 10 cakes and waited 1 hours
      Given I have eaten 10 cukes
      When I wait 1 hour
      Then my belly should not growl