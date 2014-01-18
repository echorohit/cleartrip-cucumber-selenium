package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.Configuration;
import util.CustomDate;

public class HomePage {

    private WebDriver webDriver;
    private final By departDate = By.id("DepartDate");
    private final By calendarIcon = By.className("calendarIcon");
    private final By adults = By.id("Adults");
    private final By searchBtn = By.id("SearchBtn");
    private By from =  By.id("FromTag");
    private By to = By.id("ToTag");

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void navigateToHomePage() {
        webDriver.navigate().to(Configuration.getProperty("url"));
    }

    public void navigateToFlightsSection() {
        webDriver.navigate().to(Configuration.getProperty("url") + "/flights");
    }

    public void selectOrigin(String origin) {
        webDriver.findElement(from).sendKeys(origin);
        webDriver.findElement(By.id("ui-id-1")).findElements(By.className("list")).get(0).click();
    }

    public void selectDestination(String destination) {
        webDriver.findElement(to).sendKeys(destination);
        webDriver.findElement(By.id("ui-id-2")).findElements(By.className("list")).get(0).click();
    }

    public void selectDepartureDate(String departure_date) {
        webDriver.findElement(departDate).sendKeys(departure_date);
        webDriver.findElement(calendarIcon).click();
        webDriver.findElement(By.className("ui-state-active")).click();
    }

    public void selectAdults(String noOfAdults) {
        webDriver.findElement(adults).sendKeys(noOfAdults);
    }

    public void search() {
        webDriver.findElement(searchBtn).click();
    }

    public void enterOnwardTripFlightDetails(String origin, String destination, String daysFromToday) {
        navigateToFlightsSection();
        selectOrigin(origin);
        selectDestination(destination);
        selectDepartureDate(CustomDate.dateFrom(daysFromToday));
    }
}