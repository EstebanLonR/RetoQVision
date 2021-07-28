package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaRegistro {

    public static final Target FIRST_NAME =
            Target.the("First Name").located(By.xpath("//input[@id='firstName']"));

    public static final Target LAST_NAME =
            Target.the("Last Name").located(By.xpath("//input[@id='lastName']"));

    public static final Target EMAIL =
            Target.the("Email").located(By.xpath("//input[@id='email']"));

    public static final Target BIRTH_MONTH =
            Target.the("Birth Month").located(By.xpath("//select[@aria-label='Birth month']"));

    public static final Target BIRTH_DAY =
            Target.the("Birth Day").located(By.xpath("//select[@aria-label='Birth day']"));

    public static final Target BIRTH_YEAR =
            Target.the("Birth Year").located(By.xpath("//select[@aria-label='Birth year']"));

    public static final Target NEXT_LOCATION =
            Target.the("Next:Location").located(By.xpath("//a[@aria-label='Next step - define your location']"));

    public static final Target CITY =
            Target.the("City").located(By.xpath("//input[@id='city']"));

    public static final Target POSTAL_CODE =
            Target.the("Postal Code").located(By.xpath("//input[@id='zip']"));

    public static final Target NEXT_DEVICES =
            Target.the("Next:Devices").located(By.xpath("//a[@aria-label='Next step - select your devices']"));

    public static final Target NEXT_LAST_STEP =
            Target.the("Next: Last Step").located(By.xpath("//a[@aria-label='Next - final step']"));

    public static final Target CREATE_PASSWORD =
            Target.the("Create Password").located(By.xpath("//input[@id='password']"));

    public static final Target CONFIRM_PASSWORD =
            Target.the("Confirm Password").located(By.xpath("//input[@id='confirmPassword']"));

    public static final Target CONFIRM_TERMS =
            Target.the("Confirm Terms").located(By.xpath("//span[@ng-class='{error: userForm.termOfUse.$error.required}']"));

    public static final Target CONFIRM_POLICY =
            Target.the("Confirm Policy").located(By.xpath("//span[@ng-class='{error: userForm.privacySetting.$error.required}']"));

    public static final Target COMPLETE_SETUP =
            Target.the("Complete Setup").located(By.xpath("//a[@aria-label='Complete Setup']"));

}
