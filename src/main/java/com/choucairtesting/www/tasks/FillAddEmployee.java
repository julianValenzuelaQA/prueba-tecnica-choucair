package com.choucairtesting.www.tasks;

import com.choucairtesting.www.interactions.ClickWebElement;
import io.github.cdimascio.dotenv.Dotenv;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.choucairtesting.www.ui.AddEmployeePage.*;

public class FillAddEmployee implements Task {

    Dotenv dotenv = Dotenv.load();

    String fierstName = dotenv.get("FIRST_NAME");
    String middleName = dotenv.get("MIDDLE_NAME");
    String lastName = dotenv.get("LAST_NAME");
    String password = dotenv.get("PASSOWRD_ADD_EMPLOYEE");
    String userName = dotenv.get("USER_NAME");

    public static Performable complete() {
        return Tasks.instrumented(FillAddEmployee.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Enter.theValue(fierstName).into(FIRST_NAME_INPUT),
            Enter.theValue(middleName).into(MIDDLE_NAME_INPUT),
            Enter.theValue(lastName).into(LAST_NAME_INPUT),
            Click.on(CREATE_LOGIN_DETAILS_SWITCH),
            Enter.theValue(userName).into(USER_NAME_INPUT),
            Enter.theValue(password).into(PASSWORD_INPUT),
            Enter.theValue(password).into(CONFIRM_PASSWORD_INPUT),
            ClickWebElement.on(SAVE_BUTTON)
        );
    }
}
