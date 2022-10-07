package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features= {"src\\test\\resources\\FeattureFiles\\contact.feature"},
glue= {"stepdefination"},plugin= {"html:Reports/report1.html","JSON:Reports/report2.json"},monochrome=true,publish=true,dryRun=false)

public class Runner extends AbstractTestNGCucumberTests {

}
