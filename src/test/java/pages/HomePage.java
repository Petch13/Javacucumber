package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage {

    private WebDriver driver;
    private Actions action;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.action = new Actions(driver);
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(how = How.NAME, using = "menu-two")
    public static WebElement overviewMenuButton;

    @FindBy(how = How.LINK_TEXT, using = "Program Overview")
    public static WebElement programOverview;

    @FindBy(how = How.LINK_TEXT, using = "A Health Plan for Ministry")
    public static WebElement aHealthPlanForMinistry;

    @FindBy(how = How.LINK_TEXT, using = "Investing for Social Impact")
    public static WebElement investingForSocialImpact;

    @FindBy(how = How.LINK_TEXT, using = "Social Purpose Funds")
    public static WebElement socialPurposeFunds;


    public void getURL() {
        driver.get("https://www.porticobenefits.org/");
    }

    public void waiting(int time) {
        try {
            TimeUnit.SECONDS.sleep(time);
        } catch (InterruptedException e) {
            System.out.println(e.toString());
        }
    }

    public void hoverMenuItem(WebElement menu) {
        action.moveToElement(menu).build().perform();
        waiting(2);
    }
}