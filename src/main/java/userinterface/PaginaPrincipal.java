package userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaPrincipal {

    public static final Target JOIN_TODAY =
            Target.the("JOIN_TODAY").located(By.xpath("//a[text()='Join Today'][@class='unauthenticated-nav-bar__sign-up']"));
}
