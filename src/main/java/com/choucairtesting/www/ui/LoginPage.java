package com.choucairtesting.www.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target USER_NAME_INPUT = Target.the("input de user name en login")
            .located(By.name("username"));

    public static final Target PASSWORD_INPUT = Target.the("input de password en login")
            .located(By.name("password"));

    public static final Target LOGIN_BUTTON = Target.the("boton login en login")
            .located(By.xpath("//button[@type='submit']"));
}
