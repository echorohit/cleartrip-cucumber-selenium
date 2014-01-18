package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.Configuration;
import util.WaitFor;

import java.util.List;

public class BasePage {

    private WebDriver webDriver;
    private WaitFor waitFor;
    private final By navigation = By.cssSelector(Configuration.getConfig().getProperty("navigation"));

    public BasePage(WebDriver webDriver){
        this.webDriver = webDriver;
        this.waitFor = new WaitFor(webDriver);
    }

    protected void waitAndClick(By locator) {
        waitFor.waitAndClick(locator);
    }

    protected void click(By locator) {
        webDriver.findElement(locator).click();
    }

    protected void click(WebElement element) {
        element.click();
    }

    protected void type(By locator, String sString) {
        webDriver.findElement(locator).sendKeys(sString);
    }

    protected void waitForElementPresence(By locator) {
        waitFor.elementPresence(locator);
    }

    protected void waitForElementAbsence(By locator) {
        waitFor.elementAbsence(locator);
    }

    protected void waitForPageNavigation() {
        waitForElementPresence(navigation);
        waitForElementAbsence(navigation);
    }

    protected String getText(By locator){
        return webDriver.findElement(locator).getText();
    }

    protected String getText(WebElement element) {
       return element.getText();
    }

    protected void navigate(String url){
        webDriver.navigate().to(url);
    }

    protected List<WebElement> findElements(By locator){
          return webDriver.findElements(locator);
    }
}
