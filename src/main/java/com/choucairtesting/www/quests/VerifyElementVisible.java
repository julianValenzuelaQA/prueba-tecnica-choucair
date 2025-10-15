package com.choucairtesting.www.quests;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class VerifyElementVisible implements Question<Boolean> {

    private final Target webElement;

    private VerifyElementVisible(Target webElement) {
        this.webElement = webElement;
    }

    public static VerifyElementVisible on(Target webElement) {
        return new VerifyElementVisible(webElement);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return webElement.resolveFor(actor).isVisible();
    }
}
