package cucumber.steps.cleartrip;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SharedDriver

{
    private final String url = "http://lsdatwtcqa01:8080/cleartrip/attHome.html";
    WebDriver webDriver;

    @Before
    public void beforeScenario(){
       webDriver = new FirefoxDriver();
        webDriver.manage().timeouts().pageLoadTimeout(30 , TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
       webDriver.navigate().to(url);
    }

    @After
    public void afterScenario(Scenario scenario){
        try
        {
            if(scenario.isFailed()){
                final byte[] screenshot =  ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot , "image/png");
            }
        }
        catch(WebDriverException exception){
             System.out.println("Exception while capturing screenshot for scenario " +  scenario);
        }

        webDriver.quit();
    }

    public WebDriver getDriver() {
        return webDriver;
    }

}
