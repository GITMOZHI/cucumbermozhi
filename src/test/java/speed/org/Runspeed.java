package speed.org;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\Gayathri\\eclipse-workspace\\mozhi\\Seleniumcucumber\\feature\\speed.feature",glue= {"speed.org"},
plugin= {"html:target"})

public class Runspeed {

}
