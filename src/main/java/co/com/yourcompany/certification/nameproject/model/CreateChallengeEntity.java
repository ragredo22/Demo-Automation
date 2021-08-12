package co.com.yourcompany.certification.nameproject.model;


import co.com.yourcompany.certification.nameproject.tasks.ModelData;

import java.util.List;

public class CreateChallengeEntity {


    private static LookFor lookFor = new LookFor();

    private CreateChallengeEntity() {
    }


    public static LookFor getLookFor() {
        return lookFor;
    }

    public static void setLookFor(List<String> data) {

       /* LookFor lookFor = new LookFor();
        ModelData<LookFor> aa = look -> lookFor.setSearchABook(data.get(0));*/

        LookFor lookFor = new LookFor();
        lookFor.setSearchABook(data.get(0));
        lookFor.setOptionOne(data.get(1));
        lookFor.setOptionTwo(data.get(2));
        lookFor.setAssertOneAuthor(data.get(3));
        lookFor.setAssertTwoSoldBy(data.get(4));
        lookFor.setAssertThreeCart(data.get(5));
        CreateChallengeEntity.lookFor = lookFor;

    }

}
