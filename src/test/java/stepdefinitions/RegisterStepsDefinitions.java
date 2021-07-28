package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.DatosRegistro;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import questions.ValidarBoton;
import tasks.UserRegister;


import java.util.List;

public class RegisterStepsDefinitions {

    @Managed
    private WebDriver navegador;


    @Before
    public void SetUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Pancracio");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(navegador));
    }


    @Given("^El usuario se encuentra en la pagina principal$")
    public void elUsuarioSeEncuentraEnLaPaginaPrincipal() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://utest.com/"));


    }

    @When("^El se registra$")
    public void elSeRegistra(List<DatosRegistro> datosRegistros) {
        DatosRegistro datosRegistro = datosRegistros.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(UserRegister.inThePageWhit(datosRegistro));


    }

    @Then("^Debe de ver el boton de Complete Setup$")
    public void debeDeVerElBotonDeCompleteSetup() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarBoton.completeSetup(), Matchers.is(true)));

    }


}
