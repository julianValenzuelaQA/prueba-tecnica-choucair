package com.choucairtesting.www.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class AddEmployeePage {

    public static final Target FIRST_NAME_INPUT = Target.the("input de first name en add employee")
            .located(By.name("firstName"));

    public static final Target MIDDLE_NAME_INPUT = Target.the("input de middel name en add employee")
            .located(By.name("middleName"));

    public static final Target LAST_NAME_INPUT = Target.the("input de last name en add employee")
            .located(By.name("lastName"));

    public static final Target USER_NAME_INPUT = Target.the("input de user name en add employee")
            .located(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]"));

    public static final Target PASSWORD_INPUT = Target.the("input de password en add employee")
            .located(By.xpath("//input[@type='password']"));

    public static final Target CONFIRM_PASSWORD_INPUT = Target.the("input de confirmar password en add employee")
            .located(By.xpath("(//input[@type='password'])[2]"));

    public static final Target CREATE_LOGIN_DETAILS_SWITCH = Target.the("sitch create login detail en add employee")
            .located(By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']"));

    public static final Target SAVE_BUTTON = Target.the("boton save en add employee")
            .located(By.xpath("//button[@type='submit']"));



}
