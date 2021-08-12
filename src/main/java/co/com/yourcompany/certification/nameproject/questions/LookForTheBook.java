package co.com.yourcompany.certification.nameproject.questions;

import co.com.yourcompany.certification.nameproject.model.CreateChallengeEntity;
import co.com.yourcompany.certification.nameproject.model.ModelGeneric;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.junit.Assert;

public class LookForTheBook implements Question<Boolean> {

    public LookForTheBook(){}
    @Override
    public Boolean answeredBy(Actor actor) {

        boolean resulted = false;
        String ansTitleFront = ModelGeneric.getLblNameBook().toUpperCase();
        String msgExpectedOptOne = CreateChallengeEntity.getLookFor().getOptionOne().toUpperCase();

        Assert.assertEquals(ansTitleFront, msgExpectedOptOne);
        String ansTabFront = ModelGeneric.getTabBook().substring(0,9).toUpperCase();
        String msgExpected = CreateChallengeEntity.getLookFor().getOptionTwo().toUpperCase();

      Assert.assertTrue("Messages doesn't match", msgExpected.contains(ansTabFront));

        Assert.assertEquals(CreateChallengeEntity.getLookFor().getAssertOneAuthor(),ModelGeneric.getAssertOneAuthor());
        Assert.assertEquals(CreateChallengeEntity.getLookFor().getAssertTwoSoldBy(),ModelGeneric.getAssertTwoSoldBy());
        Assert.assertEquals(CreateChallengeEntity.getLookFor().getAssertThreeCart(),ModelGeneric.getAssertThreeCart());

        if(msgExpected.contains(ansTabFront)){
            resulted = true;
        }

        return resulted;
    }
        public static LookForTheBook wasSuccessful() {
            return new LookForTheBook();
        }
    }

