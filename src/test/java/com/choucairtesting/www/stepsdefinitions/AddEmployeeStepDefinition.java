package com.choucairtesting.www.stepsdefinitions;

import com.choucairtesting.www.interactions.ClickWebElement;
import com.choucairtesting.www.quests.VerifyElementVisible;
import com.choucairtesting.www.tasks.FillAddEmployee;
import com.choucairtesting.www.tasks.SerchEmployee;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Open;

import static com.choucairtesting.www.ui.HomePage.LABOL_LOGIN_VALIDATION;
import static com.choucairtesting.www.ui.HomePage.PIM_MODULE;
import static com.choucairtesting.www.ui.PimPage.BUTTON_ADD;
import static com.choucairtesting.www.ui.PimPage.VALIDA_CREATED_EMPLOYEE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddEmployeeStepDefinition {



    @When("el usario se encuentra en pagina Home de Orange HRM")
    public void elUsarioSeEncuentraEnPaginaHomeDeOrangeHRM() {
        // nuestro background ya nos deja en la pagina home
    }

    @When("accede al modulo de Pim")
    public void accedeAlModuloDePim() {
        theActorInTheSpotlight().attemptsTo(
                ClickWebElement.on(PIM_MODULE)
        );
    }

    @When("presiona el boton add")
    public void presionaElBotonAdd() {
        theActorInTheSpotlight().attemptsTo(
                ClickWebElement.on(BUTTON_ADD)
        );
    }

    @When("completa el formulario")
    public void completaElFormulario() {
        theActorInTheSpotlight().attemptsTo(
                FillAddEmployee.complete()
        );
    }

    @When("busca al empleado en modulo de pim")
    public void buscaAlEmpleadoEnModuloDePim() {
        theActorInTheSpotlight().attemptsTo(
                SerchEmployee.forName()
        );
    }


    @Then("deberia ver al nuevo empleado creado")
    public void deberiaVerAlNuevoEmpleadoCreado() {
        theActorInTheSpotlight().should(
                seeThat("El texto dash board es visible",
                        VerifyElementVisible.on(VALIDA_CREATED_EMPLOYEE))
        );
    }
}
