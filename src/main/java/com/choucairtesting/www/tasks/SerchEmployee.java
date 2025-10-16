package com.choucairtesting.www.tasks;

import com.choucairtesting.www.interactions.ClickWebElement;
import io.github.cdimascio.dotenv.Dotenv;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.choucairtesting.www.ui.HomePage.PIM_MODULE;
import static com.choucairtesting.www.ui.PimPage.*;

public class SerchEmployee implements Task {

    Dotenv dotenv = Dotenv.load();

    String employeeName = dotenv.get("FIRST_NAME");

    public static Performable forName() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
              Click.on(PIM_MODULE),
              Enter.theValue(employeeName).into(EMPLOYEE_NAME),
              ClickWebElement.on((SERCH_BUTTON))
        );
    }
}
