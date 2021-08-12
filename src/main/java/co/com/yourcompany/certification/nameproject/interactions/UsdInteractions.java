package co.com.yourcompany.certification.nameproject.interactions;

import co.com.yourcompany.certification.nameproject.model.CreateUsdEntity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;

import static co.com.yourcompany.certification.nameproject.userinterface.objects.UsdObjects.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UsdInteractions implements Interaction {


    public static Interaction usdTool(){

        return instrumented(UsdInteractions.class);
    }

    @Override
    public <T extends Actor> void performAs(T theActor) {
        String nameUser = CreateUsdEntity.getLookFor().getUser();
        String pass = CreateUsdEntity.getLookFor().getPass();

        theActor.attemptsTo(Check.whether(BTNLOGIN.resolveFor(theActor).isVisible()).andIfSo(
                Enter.theValue(nameUser).into(USERNAME),
                Enter.theValue(pass).into(PASSWORD),
                Click.on(BTNLOGIN)
        ));
        theActor.attemptsTo(Wait.elementIsVisible(9000));
    }
}
