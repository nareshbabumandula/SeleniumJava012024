Feature: EyeGlassWorld Store Search 

Background:
Given I access eyeglassworld website

@smoke
Scenario: verify the functionaliy of searching an eye glass store based on city name
When I search for a store based on "tampa" name
Then I should see the appropriate results with city/state/zipcode "tampa"

@smoke1
Scenario: verify the functionaliy of searching an eye glass store based on state name
When I search for a store based on "florida" name
Then I should see the appropriate results with city/state/zipcode "florida"

@smoke2
Scenario: verify the functionaliy of searching an eye glass store based on zipcode
When I search for a store based on "33629" name
Then I should see the appropriate results with city/state/zipcode "33629"

Scenario Outline: verify the functionaliy of searching an eye glass store based on city name
When I search for a store based on "<city/state/zipcode>" name
Then I should see the appropriate results with city/state/zipcode "<city/state/zipcode>"
Examples:
|city/state/zipcode|
|tampa|
|florida|
|33629|
|atlanta|

@dryrun
Scenario: verify the functionaliy of searching an eye glass store based on city name
When I search for a store based on city/state/zipcode
|tampa|
|florida|
|33629|
|atlanta|
Then I should see the appropriate results with city/state/zipcode "atlanta"
