package co.com.yourcompany.certification.nameproject.userinterface.objects;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UsdObjects {

    public static final Target USERNAME = Target.the("User Name").located(By.id("USERNAME"));
    public static final Target PASSWORD = Target.the("Password").located(By.id("PIN"));
    public static final Target BTNLOGIN = Target.the("Btn Login").located(By.id("imgBtn0"));
}
