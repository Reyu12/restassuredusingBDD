package restdemo.restdemo;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="./src/test/resources/features/alltestscenarios.feature",
glue="restdemo.restdemo")
public class RunCucumberTest {

}
