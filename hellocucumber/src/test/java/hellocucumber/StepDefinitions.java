package hellocucumber;

import io.cucumber.java.en.*;
import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Etantdonné;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

    @Given("an example scenario")
    public void anExampleScenario() {
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }

    
    private String aujourdhui;
    private String actualAnswer;


    @Etantdonné("on est {string}")
    public void on_est_string(String jour) {
        aujourdhui = jour;
    }

    @When("on me demande si c'est vendredi")
    public void on_me_demande() {
        actualAnswer = getReponse(aujourdhui);
    }

    @Alors("je devrais répondre {string}")
    public void je_devrais_repondre_actualAnswer(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }

    public String getReponse(String jour){
        return "vendredi".equals(jour) ? "TGIF" : "non";
    }
}
