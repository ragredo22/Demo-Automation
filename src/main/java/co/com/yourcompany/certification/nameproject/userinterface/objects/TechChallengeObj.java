package co.com.yourcompany.certification.nameproject.userinterface.objects;

import co.com.yourcompany.certification.nameproject.util.constant.TechChallengeConstant;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class TechChallengeObj {


    public static final Target IMAGE = Target.the("Image logo").located(By.id("nav-logo-sprites"));
    public static final Target LOOKFOR = Target.the("LOOKFOR").located(By.id("twotabsearchtextbox"));
    public static final Target BTN_LOOKFOR = Target.the("Look for button").locatedBy("//input[@value='Go']");
    public static final Target BOOK = Target.the("Book").locatedBy("//*[@id=\"search\"]/div[1]/div[1]/div[1]/span[3]/div[2]/div[4]/div/span/div/div/div[2]/div[2]/div/div/div[1]/h2/a/span");

    public static final Target TITLE_NAME_BOOK = Target.the("Book Name").locatedBy("//*[@class='a-size-extra-large']");
    public static final Target TAB_INF_BOOK = Target.the("TAB midle book").locatedBy("//*[@id=\"mediaTab_heading_2\"]");

    public static final Target RADIO_BTN = Target.the("Radio btn").locatedBy("//*[@class='a-icon a-accordion-radio a-icon-radio-inactive']");

    public static final Target ASSERT_ONE_AUTHOR = Target.the("Assert one Endava Challenge").locatedBy("//*[@class='a-link-normal contributorNameID']");
    public static final Target ASSERT_TWO_SOLD_BY = Target.the("Assert two Endava challenge").locatedBy("//*[@class='a-section a-spacing-base']/div/a[text()='RAE global']");
    public static final Target ASSERT_THREE_CART = Target.the("Assert two Endava challenge").locatedBy("//*[@id='nav-cart-count']");


    private TechChallengeObj() {
        throw new IllegalStateException(TechChallengeConstant.UI_CLASS);
    }
}
