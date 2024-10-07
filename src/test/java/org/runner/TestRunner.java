package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvmreportgenerate.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@Reg", monochrome = false,dryRun = false,publish=false, snippets = SnippetType.CAMELCASE, 
plugin = {"pretty","usage", "json:target//output.json", "html:target//output.html","junit:target//output.xml" },
stepNotifications = true, name = {"verify the facebook login functionality with valid credentials" },
features = "src\\test\\resources", glue = "org.step")

public class TestRunner {

	@AfterClass
	public static void afterClass() {
		Reporting.generateJVMReport("C:\\Users\\Thangapandiyan P\\eclipse-workspace\\Cucumber\\target\\output.json");
	}

}
