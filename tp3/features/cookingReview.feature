#------------------------------
# Cooking
# Loelia Dem - 2024-2025
#------------------------------
# language: en
Feature: Cooking
  Every cooking recipe has some recurrent steps.

  Scenario: Avoiding overcooking a dish in the oven
    Given a dish needs to be cooked in the oven
    When it stays in the oven too long
    Then the meal is ruined

  Scenario: Cooking pasta
    Given the water is boiling
    When I add pasta to the pot
    Then the pasta will cook properly
