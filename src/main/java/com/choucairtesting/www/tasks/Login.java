package com.choucairtesting.www.tasks;

import io.github.cdimascio.dotenv.Dotenv;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.choucairtesting.www.ui.LoginPage.*;

public class Login implements Task {

Dotenv dotenv = Dotenv.load();

String user = dotenv.get("USER_LOGIN");
String password = dotenv.get("PASSWORD_LOGIN");

    public static Performable validCredentials() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user).into(USER_NAME_INPUT),
                Enter.theValue(password).into(PASSWORD_INPUT),
                Click.on(LOGIN_BUTTON)
        );
    }
}
