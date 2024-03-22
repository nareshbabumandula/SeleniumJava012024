Feature: EyeGlassWorld Store Search 

Background:
Given I access eyeglassworld website

@smoke
Scenario: verify the functionaliy of searching an eye glass store based on city name
When I search for a store based on "tampa" name
Then I should see the appropriate results

@dryrun
Scenario: verify the functionaliy of searching an eye glass store based on state name
When I search for a store based on "florida" name
Then I should see the appropriate results

Scenario: verify the functionaliy of searching an eye glass store based on zipcode
When I search for a store based on "33629" name
Then I should see the appropriate results
