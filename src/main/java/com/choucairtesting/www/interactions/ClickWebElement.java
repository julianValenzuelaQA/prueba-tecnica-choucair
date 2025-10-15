package com.choucairtesting.www.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class ClickWebElement implements Interaction {


    private final Target webElement;

    public ClickWebElement(Target webElement) {
        this.webElement = webElement;
    }

    public static ClickWebElement on(Target webElement) {
        return Tasks.instrumented(ClickWebElement.class, webElement);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(webElement)
        );
    }
}
