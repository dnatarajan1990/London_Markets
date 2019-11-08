package TestRunner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features/LoginPage"
        , glue = {"StepClasses"}
        , plugin = {"pretty",
        "html:target/CucumberReports/",
        "junit:target/CucumberReports/Cucumber.xml",
        "json:target/CucumberReports/Cucumber.json"}
)
public class LoginTestrunner {
}