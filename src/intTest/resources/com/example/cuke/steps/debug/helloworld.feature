Feature: A parrot bot

  @hello
  Scenario: Say hello
    Given I have a parrot app with "Howdy"
    When I ask it to say something
    Then it should answer with "Howdy World"

  @goodbye
  Scenario: Say goodbye
    Given I have a parrot app with "Goodbye"
    When I ask it to say something
    Then it should answer with "Goodbye World"