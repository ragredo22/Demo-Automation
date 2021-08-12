package co.com.yourcompany.certification.nameproject.model;

import java.util.List;

public class CreateUsdEntity {

    private static LookFor lookFor = new LookFor();

    private CreateUsdEntity(){}

    public static LookFor getLookFor() {
        return lookFor;
    }

    public static void setLookFor(List<String> data) {
        LookFor lookFor = new LookFor();


        lookFor.setUser(data.get(0));
        lookFor.setPass(data.get(1));
        CreateUsdEntity.lookFor = lookFor;


    }
}
