package co.com.yourcompany.certification.nameproject.tasks;

import co.com.yourcompany.certification.nameproject.interactions.UsdInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Authenticate implements Task {

    public static Authenticate usdtool(){
        return instrumented(Authenticate.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        authenticateUser(actor);
    }

    private <T extends Actor> void authenticateUser(T theActor) {

        theActor.attemptsTo(UsdInteractions.usdTool());
    }


}
