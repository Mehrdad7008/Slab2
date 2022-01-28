import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:features"}, glue={"MyStepdefs"},plugin = {"pretty", "html:target/cucumber-html-report"},  dryRun = true)
public class RunnerTest {

}
