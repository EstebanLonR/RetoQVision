package questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Enabled;
import userinterface.PaginaRegistro;

public class ValidarBoton implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Enabled.of(PaginaRegistro.COMPLETE_SETUP).viewedBy(actor).asBoolean();
    }

    public static ValidarBoton completeSetup() {
        return new ValidarBoton();
    }
}
