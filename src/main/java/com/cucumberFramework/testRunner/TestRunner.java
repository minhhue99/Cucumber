package com.cucumberFramework.testRunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;


@CucumberOptions(features = 

"src/test/resources/features/Module/SearchBookingPayment.feature"
//"src/test/resources/features/Module/SetupRooms.feature"
//"src/test/resources/features/Module/Login.feature",
//"src/test/resources/features/Module/Check.feature",
//"src/test/resources/features/Module/Cancel.feature"

, glue = { "com/cucumberFramework/stepdefinitions" }
, tags = {"@Test1"}
, plugin = { "json:target/cucumber-reports/CucumberReport.json" }
,monochrome = true
,dryRun = false)
public class TestRunner {
	
	private TestNGCucumberRunner testNGCucumberRunner;
	   
	@BeforeClass(alwaysRun = true)
	public void setUpClass() {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}

	@Test(groups = "cucumber", description = "Runs cucmber Features", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}

	@DataProvider
	public Object[][] features() {
		return testNGCucumberRunner.provideFeatures();
	}

	@AfterClass(alwaysRun = true)
	public void testDownClass() {
		testNGCucumberRunner.finish();
	}

}
