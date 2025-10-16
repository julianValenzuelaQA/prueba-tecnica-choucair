package com.choucairtesting.www.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target LABOL_LOGIN_VALIDATION = Target.the("texto dashboard en hme page")
            .located(By.xpath("//h6[text()='Dashboard']"));

    public static final Target PIM_MODULE = Target.the("modulo de pim")
            .located(By.xpath("//span[text()='PIM']"));

}
