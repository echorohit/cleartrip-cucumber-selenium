import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(tags = {"@smoke"} , format = {"pretty" , "html:target/cucumber"} , features = "src/test/resources")
public class RunSmokeTests {
}
