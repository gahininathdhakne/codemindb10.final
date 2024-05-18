package stepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/cucumberfeatures/Login.feature"}, glue= {"stepDefination"}, 
tags="login", publish =true)
public class RunnerClass {

}
