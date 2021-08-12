package co.com.yourcompany.certification.nameproject.tasks;


import co.com.yourcompany.certification.nameproject.exceptions.TechChallenge;
import co.com.yourcompany.certification.nameproject.util.challengeEnvironment.TechFrontQA;
import co.com.yourcompany.certification.nameproject.util.properties.Techproperties;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenBrowser implements Task {

    private String qa;


    public OpenBrowser(String qa) {
        this.qa = qa;
    }

    public OpenBrowser() {
    }

    public static OpenBrowser techChallengeSite() {
        return Tasks.instrumented(OpenBrowser.class);
    }

    public static OpenBrowser techChallengeSite(String qa) {

        return Tasks.instrumented(OpenBrowser.class, qa);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String strUrlQA;
        try {
            String url;
            if (qa != null) {
                strUrlQA = qa;
                url = Techproperties.getUrlFront().replace("$$", strUrlQA.toLowerCase());
                actor.attemptsTo(Open.url(url));
            } else {
                actor.attemptsTo(Open.url(TechFrontQA.enterUSDChallenge()));
            }
        } catch (Exception e) {
            throw new TechChallenge(e);

        }

    }
}
