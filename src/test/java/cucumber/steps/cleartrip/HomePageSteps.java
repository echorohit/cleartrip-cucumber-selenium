package cucumber.steps.cleartrip;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.SearchResultsPage;


public class HomePageSteps {


    private WebDriver webDriver;
    private HomePage homePage;
    private SearchResultsPage searchResultsPage;

    public HomePageSteps(SharedDriver driver){
        webDriver = driver.getDriver();
        homePage = new HomePage(webDriver);
        searchResultsPage = new SearchResultsPage(webDriver);
    }


    @Given("^the user navigates to cleartrip homepage$")
    public void the_user_navigates_to_cleartrip_homepage() throws Throwable {
        homePage.navigateToHomePage();

    }

    @When("^user selects flight$")
    public void user_selects_flight() throws Throwable {
        homePage.navigateToFlightsSection();
    }

    @And("^user selects no of adults as \"([^\"]*)\"$")
    public void user_selects_no_of_adults_as(String noOfAdults) throws Throwable {
        homePage.selectAdults(noOfAdults);
    }

    @And("^user searches for flight$")
    public void user_searches_for_flight() throws Throwable {
        homePage.search();
    }

    @When("^user selects a flight from \"([^\"]*)\" to \"([^\"]*)\" \"([^\"]*)\" days from today$")
    public void user_selects_a_flight_from_to_days_from_today(String origin, String destination, String daysFromToday) throws Throwable {
        homePage.enterOnwardTripFlightDetails(origin, destination, daysFromToday);
    }

    @And("^user books a flight$")
    public void user_books_a_flight() throws Throwable {
        searchResultsPage.book();
    }
}