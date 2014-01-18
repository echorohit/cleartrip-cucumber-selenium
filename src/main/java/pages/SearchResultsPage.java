package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.Configuration;
import util.CustomDate;

public class SearchResultsPage {

    private WebDriver webDriver;
    private final By book = By.className("booking");
    private final By resultUnit = By.className("resultUnit");


    public SearchResultsPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void book() {
        webDriver.findElements(resultUnit).get(0).findElement(book).click();
    }
}