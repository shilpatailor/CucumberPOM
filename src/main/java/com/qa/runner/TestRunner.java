package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		 //the path of the feature files
		features="src\\main\\java\\com\\qa\\feature\\freecrm.feature", //the path of the feature files
		glue="com/qa/setpDefinations", //the path of the step definition files
		dryRun= false,  //to check the mapping is proper between feature file and step def file
		monochrome=true, //display the console output in a proper readable format
		plugin= {"pretty","html:target/test-output/cucumber.html", "json:target/json_ouput/cucumber.json", "junit:target/junit_xml/cucumber.xml"}, //to generate different types of reporting
		strict = true  //it will check if any step is not defined in step definition file
		//,tags = {"~@SmokeTest", "~@RegressionTest", "~@End2End"}
		)

    //ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
	//ANDed : tags = tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest

public class TestRunner {

}
