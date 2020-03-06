package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature/searchh.feature",
					glue="search",
					tags="@login11",
					plugin= {"pretty", "html:HTMLReport","json:JSONReport/cucumber.json","junit:JUNITReport/cucumber.jxl"})
public class RunAdd {

}
