package co.com.yourcompany.certification.nameproject.stepdefinitions;

import co.com.yourcompany.certification.nameproject.exceptions.ValidateException;
import co.com.yourcompany.certification.nameproject.model.CreateChallengeEntity;
import co.com.yourcompany.certification.nameproject.questions.LookForTheBook;
import co.com.yourcompany.certification.nameproject.tasks.OpenBrowser;
import co.com.yourcompany.certification.nameproject.tasks.SearchABook;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import static co.com.yourcompany.certification.nameproject.exceptions.ValidateException.LOOK_FOR_A_BOOK;
import static co.com.yourcompany.certification.nameproject.tasks.OpenBrowser.techChallengeSite;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class TechChallengeStepDefinition {


    @Given("^(.*) visit the page amazon$")
    public void iVisitThePageAmazon(String actorName) {
        theActorCalled(actorName).wasAbleTo(OpenBrowser.techChallengeSite());

    }

    @When("^I'm looking for a book$")
    public void iMLookingForABook(List<String> data){
        CreateChallengeEntity.setLookFor(data);
        theActorInTheSpotlight().attemptsTo(SearchABook.withTheFollowinData());


    }

    @Then("^I see two interesting books$")
    public void iSeeTwoInterestingBooks(){

        theActorInTheSpotlight().should(seeThat(LookForTheBook.wasSuccessful()).orComplainWith(ValidateException.class, LOOK_FOR_A_BOOK));
    }



    @Given("^(.*) ingreso URL$")
    public void ingreso_URL(String actorName) throws Exception {
        theActorCalled(actorName).wasAbleTo(OpenBrowser.techChallengeSite("https://svebc-qa01.todo-1.com/bcbancos/control/BolePortal.bancolombia"));
    }

    @When("^login e inscripcion$")
    public void login_e_inscripcion(List<String> data) throws Exception {


    }

    @Then("^creo el usuario$")
    public void creo_el_usuario() throws Exception {
        // Write code here that turns the phrase above into concrete actions

    }





}
