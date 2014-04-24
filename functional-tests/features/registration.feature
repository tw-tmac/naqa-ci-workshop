Feature: Student registration
  As a Starfleet cadet
  I would like to register for classes
  So I can become the greatest captain ever

Scenario: Registration
  Given I am on the registration page
  When I register for 'Ruby 101'
  Then I should have a confirmation for 'Ruby 101'