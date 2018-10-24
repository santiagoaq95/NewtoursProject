package com.newtours.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="resources/features/google", tags="@tag1", glue="com/newtours/stepdefinitions/",
plugin= {"pretty", "html:target/reports-google"}, monochrome=true)
public class TestRunnerGoogleSearch {

}
