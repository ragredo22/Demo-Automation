package co.com.yourcompany.certification.nameproject.tasks;

import co.com.yourcompany.certification.nameproject.interactions.TechChallengeInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchABook implements Task {




    public static SearchABook withTheFollowinData() {
        return instrumented(SearchABook.class);
    }


    @Override
    public <T extends Actor> void performAs(T theActor) {

        authenticateUser(theActor);

    }

    private <T extends Actor> void authenticateUser(T theActor) {

        theActor.attemptsTo(TechChallengeInteractions.techChallenge());

    }


}
