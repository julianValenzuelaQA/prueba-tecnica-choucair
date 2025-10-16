package com.choucairtesting.www.stepsdefinitions;

import com.choucairtesting.www.quests.VerifyElementVisible;
import com.choucairtesting.www.tasks.Login;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.choucairtesting.www.ui.HomePage.LABOL_LOGIN_VALIDATION;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinition {

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("el usuario se necuentra en la pagina login de Orange HRM")
    public void elUsuarioSeNecuentraEnLaPaginaLoginDeOrangeHRM() {
        theActorCalled("user");
        theActorInTheSpotlight().attemptsTo(
                Open.browserOn().thePageNamed("webdriver.base.url")
        );
    }

    @When("ingresa sus credenciales validas")
    public void ingresaSusCredencialesValidas() {
        theActorInTheSpotlight().attemptsTo(
                Login.validCredentials()
        );
    }

    @Then("deberia ver la pagina Home de Orange HRM")
    public void deberiaVerLaPaginaHomeDeOrangeHRM() {
        theActorInTheSpotlight().should(
                seeThat("El texto dash board es visible",
                VerifyElementVisible.on(LABOL_LOGIN_VALIDATION))
        );
    }
}
