import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(tags = {"@book"} , format = {"pretty" , "html:target/cucumber"} , features = "src/test/resources")
public class RunBookingTests {
}
