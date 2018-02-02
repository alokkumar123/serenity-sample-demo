package com.Sample.cucumber.runnerClass;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)

@CucumberOptions(features = "src/test/resources/featureFiles", tags = "@test-111", glue = {
							"com.Sample.cucumber.stepDefs" }, format = { "pretty", "html:target/cucumber",
							"json:target/cucumber-report.json" })
//@CucumberOptions(features = "src/test/resources/featureFiles", tags = {"@test-111"}, format = {"json:target/cucumber/report.json"})
public class runnerClass {
}
