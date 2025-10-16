package com.choucairtesting.www.interactions;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Interaction;

public class SelectFromDropdown implements Interaction {

    private final Target target;
    private final String option;
    private final String type;

    public SelectFromDropdown(Target target, String option, String type) {
        this.target = target;
        this.option = option;
        this.type = type;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElement element = target.resolveFor(actor);
        Select dropdown = new Select(element);

        switch (type.toLowerCase()) {
            case "text":
                dropdown.selectByVisibleText(option);
                break;
            case "value":
                dropdown.selectByValue(option);
                break;
            case "index":
                dropdown.selectByIndex(Integer.parseInt(option));
                break;
            default:
                throw new IllegalArgumentException("Tipo de selección no válido: " + type);
        }
    }

    public static SelectFromDropdown byVisibleText(Target target, String text) {
        return Tasks.instrumented(SelectFromDropdown.class, target, text, "text");
    }

    public static SelectFromDropdown byValue(Target target, String value) {
        return Tasks.instrumented(SelectFromDropdown.class, target, value, "value");
    }

    public static SelectFromDropdown byIndex(Target target, String index) {
        return Tasks.instrumented(SelectFromDropdown.class, target, index, "index");
    }
}
