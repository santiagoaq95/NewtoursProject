package com.newtours.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="resources/features",tags="@Login",glue="com/newtours/stepdefinitions/",
plugin= {"pretty", "html:target/cucumber-reports"}, monochrome=true)
public class TestRunnerNewtoursLogin {

}
