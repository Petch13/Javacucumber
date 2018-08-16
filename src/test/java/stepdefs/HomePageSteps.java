package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import support.Hooks;

import static pages.HomePage.*;

public class HomePageSteps {

    private WebDriver driver;
    private HomePage page;

    public HomePageSteps(Hooks hooks) {
        this.page = new HomePage(hooks.getDriver());
        this.driver = hooks.getDriver();
    }

    @Given("^I am navigating to the Portico Benefits and Services home page$")
    public void iAmNavigatingToThePorticoBenefitsAndServicesHomePage() throws Throwable {
        page.getURL();
    }

    @When("^I hover over the Overview tab$")
    public void iHoverOverTheOverviewTab() throws Throwable {
        page.hoverMenuItem(overviewMenuButton);
    }

    @Then("^I click the Program Overview link$")
    public void iClickTheProgramOverviewLink() throws Throwable {
        page.ClickElemenet(programOverview);
    }

    @Then("^I click the A Health Plan for Ministry link$")
    public void iClickTheAHealthPlanForMinistryLink() throws Throwable {
        page.ClickElemenet(aHealthPlanForMinistry);
    }

    @Then("^I click the Investing for Social Impact link$")
    public void iClickTheInvestingForSocialImpactLink() throws Throwable {
        page.ClickElemenet(investingForSocialImpact);
    }

    @Then("^I verify that we arrived on the Program Overview page$")
    public void iVerifyThatWeArrivedOnTheProgramOverviewPage() throws Throwable {
        String url = driver.getCurrentUrl();
        assert(url == "https://www.porticobenefits.org/PorticoBenefits/Overview/UnderstandBenefits/ProgramOverview.aspx");
    }

    @Then("^I verify that we arrived the A Health Plan for Ministry page$")
    public void iVerifyThatWeArrivedOnTheAHealthPlanForMinistryPage() throws Throwable {
        String url = driver.getCurrentUrl();
        assert(url == "https://www.porticobenefits.org/Overview/UnderstandBenefits/HealthPlanForMinistry");
    }

}
