package dojo;

import static org.junit.Assert.assertEquals;

import java.util.List;

import com.mycompany.app.Order;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CocktailSteps {

    private Order order;

    @Given("{string} who wants to buy a drink")
    public void string_wants_drink(String owner){
        order = new Order();
        order.declareOwner(owner);
    }

    @When("an order is declared for {string}")
    public void order_declared(String target){
        order.declareTarget(target);
    }

    @Then("there is {int} cocktail in the order")
    public void no_cocktail(int nbCocktails){
        List<String> cocktails = order.getCocktails();
        assertEquals(nbCocktails, cocktails.size());
    }

}
