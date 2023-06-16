
@TopUp
Feature: Topup tabungan emas
  Scenario: Customer Successfully Opens a Gold Savings Account and Creates a Virtual Account through Account Topping Up
    Given Customer on Pegadaian login page
    When Customer input phone number and password
    And Customer click chapcha
    And Customer clic Masuk button
    And Customer click Buka Tabungan button
    And Customer input all personal details
    And Customer input all branch detail
    And Customer click check box agreement
    And Customer select BRI as payment method
    Then Customer able to see the VA

