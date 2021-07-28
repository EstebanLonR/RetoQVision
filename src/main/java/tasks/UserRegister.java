package tasks;


import model.DatosRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;
import userinterface.PaginaPrincipal;
import userinterface.PaginaRegistro;

public class UserRegister implements Task {
    private DatosRegistro datosRegistro;

    public UserRegister(DatosRegistro datosRegistro) {
        this.datosRegistro = datosRegistro;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo
                (Click.on(PaginaPrincipal.JOIN_TODAY),
                        SendKeys.of(datosRegistro.getFirstName()).into(PaginaRegistro.FIRST_NAME),
                        SendKeys.of(datosRegistro.getLastName()).into(PaginaRegistro.LAST_NAME),
                        SendKeys.of(datosRegistro.getEmail()).into(PaginaRegistro.EMAIL),
                        SelectFromOptions.byValue("number:8").from(PaginaRegistro.BIRTH_MONTH),
                        SelectFromOptions.byValue("number:9").from(PaginaRegistro.BIRTH_DAY),
                        SelectFromOptions.byValue("number:2000").from(PaginaRegistro.BIRTH_YEAR),
                        Click.on(PaginaRegistro.NEXT_LOCATION),
                        SendKeys.of(datosRegistro.getCity()).into(PaginaRegistro.CITY),
                        Hit.the(Keys.ARROW_DOWN).into(PaginaRegistro.CITY),
                        Hit.the(Keys.ENTER).into(PaginaRegistro.CITY),
                        SendKeys.of(datosRegistro.getPostalCode()).into(PaginaRegistro.POSTAL_CODE),
                        Click.on(PaginaRegistro.NEXT_DEVICES),
                        Click.on(PaginaRegistro.NEXT_LAST_STEP),
                        SendKeys.of(datosRegistro.getPassword()).into(PaginaRegistro.CREATE_PASSWORD),
                        SendKeys.of(datosRegistro.getPassword()).into(PaginaRegistro.CONFIRM_PASSWORD),
                        Click.on(PaginaRegistro.CONFIRM_TERMS),
                        Click.on(PaginaRegistro.CONFIRM_POLICY)

                        );
    }

    public static UserRegister inThePageWhit(DatosRegistro datosRegistro) {
        return new UserRegister(datosRegistro);
    }

}

