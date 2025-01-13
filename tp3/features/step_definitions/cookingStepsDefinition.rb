# -*- coding: utf-8 -*-
# usage: cucumber --tags "not @wip"
# -------------------
# Author::    Loélia Demany
# License::   Distributes under the same terms as Ruby
# -------------------
require "rspec/expectations"


# Dish in oven
Given("a dish needs to be cooked in the oven") do
  @dish = { cooked_in_oven: true, state: "raw" }
end

When("it stays in the oven too long") do
  @dish[:state] = "burned"
end

Then("the meal is ruined") do
  expect(@dish[:state]).to eq("burned")
  puts "The meal is ruined because the dish was overcooked."
end


# Cooking pasta
Given("the water is boiling") do
  @water = { temperature: 100, has_pasta: false }
end

When("I add pasta to the pot") do
  @water[:has_pasta] = true
end

Then("the pasta will cook properly") do
  expect(@water[:has_pasta]).to be true
  puts "The pasta is now cooking in the boiling water."
end
