package co.com.yourcompany.certification.nameproject.util.challengeEnvironment;

import co.com.yourcompany.certification.nameproject.util.constant.TechConstantManager;
import co.com.yourcompany.certification.nameproject.util.properties.Techproperties;

import java.util.HashMap;
import java.util.Map;

public class TechFrontQA {

    private TechFrontQA() {
    }

    public static String enterUSDChallenge() {

        String strUrl = Techproperties.getUrlFront();

        Map<String, String> map = new HashMap<>();
        map.put("CH", TechConstantManager.CH);
        String qa = map.get(strUrl);
        if (qa == null) {
            throw new NullPointerException(TechConstantManager.QA_NO_EXISTE);
        } else {
            return qa;
        }

    }
}
