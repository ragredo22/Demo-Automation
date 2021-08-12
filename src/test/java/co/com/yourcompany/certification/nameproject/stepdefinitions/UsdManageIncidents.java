package co.com.yourcompany.certification.nameproject.stepdefinitions;

import co.com.yourcompany.certification.nameproject.model.CreateChallengeEntity;
import co.com.yourcompany.certification.nameproject.model.CreateUsdEntity;
import co.com.yourcompany.certification.nameproject.tasks.Authenticate;
import co.com.yourcompany.certification.nameproject.tasks.OpenBrowser;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UsdManageIncidents {


    @Given("^(.*) visited on USD$")
    public void iVisitedOnUSD(String actorName){

        theActorCalled(actorName).wasAbleTo(OpenBrowser.techChallengeSite());
    }

    @When("^I am manage the incidents$")
    public void iMManageTheIncidents(List<String> data){
        CreateUsdEntity.setLookFor(data);
        theActorInTheSpotlight().attemptsTo(Authenticate.usdtool());


    }

    @Then("^quality the incidents$")
    public void qualityTheIncidents() throws Exception {


    }
}
