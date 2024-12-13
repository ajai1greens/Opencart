package com.omrbranch.runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@LoginReg2", plugin = { "pretty", "json:target//openCart.json",
		"html:target//index.html" }, dryRun = !true, glue = "com.omrbranch.stepdefinition", features = "src\\test\\resources\\Features")
public class TestRunnerClass extends BaseClass {
	@AfterClass
	public static void reportGenerate() throws FileNotFoundException, IOException {
		Reporting.generateReports("C:\\Users\\AJAI\\eclipse-workspace\\OpenCart\\target\\openCart.json");

	}
}
