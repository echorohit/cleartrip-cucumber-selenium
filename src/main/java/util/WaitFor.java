package util;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaitFor {

    private WebDriver webdriver;
    int timeOut = Integer.parseInt(Configuration.getProperty("timeout"));

    public WaitFor(WebDriver webdriver)
    {

        this.webdriver = webdriver;
    }

    public void elementPresence(By by) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(webdriver)
                .withTimeout(timeOut, TimeUnit.SECONDS)
                .pollingEvery(500, TimeUnit.MILLISECONDS)
                .ignoring(NoSuchElementException.class);
        boolean b = wait.until(ExpectedConditions.elementToBeClickable(by)) != null;
    }

    public void waitAndClick(By locator) {
        if ((new WebDriverWait(webdriver, timeOut)).ignoring(NoSuchElementException.class).until(ExpectedConditions.elementToBeClickable(locator)) != null) {
            webdriver.findElement(locator).click();
        }
    }
    public void elementAbsence(By by) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(webdriver)
                .withTimeout(timeOut, TimeUnit.SECONDS)
                .pollingEvery(500, TimeUnit.MILLISECONDS)
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.not(ExpectedConditions.visibilityOfElementLocated(by)));
    }
}
