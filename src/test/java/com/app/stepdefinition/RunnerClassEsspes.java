package com.app.stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\dharu\\eclipse-workspace\\Java\\Test\\src\\test\\java\\com\\app\\feature\\LoginPage.feature", glue="com.app.stepdefinition", dryRun = false, tags = "@asList")

public class RunnerClassEsspes {

}
