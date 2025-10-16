package com.choucairtesting.www.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PimPage {

    public static final Target BUTTON_ADD = Target.the("boton add en modulo pim")
            .located(By.xpath("//button[text()=' Add ']"));

    public static final Target EMPLOYEE_NAME = Target.the("input employee name en modulo pim")
            .located(By.xpath("//input[@placeholder='Type for hints...']"));

    public static final Target SERCH_BUTTON = Target.the("boton buscar en modulo pim")
            .located(By.xpath("//button[text()=' Search ']"));

    public static final Target VALIDA_CREATED_EMPLOYEE = Target.the("labol de usuario encontrados")
            .located(By.xpath("//span[text()='(1) Record Found']"));





}
