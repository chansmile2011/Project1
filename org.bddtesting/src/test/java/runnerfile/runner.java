package runnerfile;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@Test

//and data ---@CucumberOptions(features="./src/test/java/featuresfile",glue={"stepdefinitionfile"},tags={"@smoke","@Regresion"})

//or data --@CucumberOptions(features="./src/test/java/featuresfile",glue={"stepdefinitionfile"},tags={"@smoke,@Regresion"})

@CucumberOptions(features="./src/test/java/featuresfile",glue={"stepdefinitionfile"},tags={"@smoke"})

public class runner extends AbstractTestNGCucumberTests{
	
	

}
