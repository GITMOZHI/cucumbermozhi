package org.cum;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\Gayathri\\eclipse-workspace\\mozhi\\Seleniumcucumber\\src\\main\\java\\org\\cum\\org.feature",glue= {"org.cum"},
plugin= {"html:target"})


public class Newrunner {

}
