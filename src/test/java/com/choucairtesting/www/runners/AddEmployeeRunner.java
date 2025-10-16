package com.choucairtesting.www.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/add_employee.feature",
        glue = "com.choucairtesting.www.stepsdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@wik"
)
public class AddEmployeeRunner {
}
