Feature: Unit tests collection
  Scenario: Breaker guesses a number between 1 and 10
    Given the Maker has chosen a number 5
    #  When the Breaker makes a guess
    Then the Maker is asked "ok" if breaker guessed 5
    Then the Maker is asked "fail" if breaker guessed 6

#Feature: Unit tests collection to manage transactions of a Nubank credit card
#  Scenario: Create account with an active credit card and valid available limit amount
#    Given Active card: true, available limit: 100
#    Then Account is created successfully