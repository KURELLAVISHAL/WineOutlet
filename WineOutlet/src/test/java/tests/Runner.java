package tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"E:\\automation\\WineOutlet\\src\\test\\resources\\wineOutletResources\\feature2.feature"},
plugin= {"pretty","html:target"},
monochrome=true)
public class Runner
{
	
}
