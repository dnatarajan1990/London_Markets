package StepClasses;

import PageMethods.ConfigFileReader;
import PageMethods.HomePageMethods;
import PageMethods.LoginPageMethods;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;


public class LoginPageSteps {
public static WebDriver driver;
private ConfigFileReader configFileReader = new ConfigFileReader();


@Before
public void beforeScenario() {
    WebDriverManager.getInstance(CHROME).setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@After
public void afterScenario() {
    driver.quit();
}

@Given("^The user has launched the application$")
public void the_user_has_launched_the_application() {
    //driver.get(configFileReader.ConfigFileReader());
    //driver.get(AppConstants.APP_BASEURL);
}

@When("^the user enters the username as \"([^\"]*)\"$")
public void the_user_enters_the_username_as(String username) {
    LoginPageMethods.UsernameTextInput(username);
}

@When("^the user enters the password as \"([^\"]*)\"$")
public void the_user_enters_the_password_as(String password) {
    LoginPageMethods.PasswordTextInput(password);
}

@When("^the user clicks on the login button$")
public void the_user_clicks_on_the_login_button() {
    LoginPageMethods.LoginButton();
}

@Then("^the user should be on the home page$")
public void the_user_should_be_on_the_home_page() {
    //Assert.assertTrue(HomePageMethods.HomePageTitle().contains(AppConstants.APP_HOMEPAGETITLE));
    Assert.assertTrue(HomePageMethods.IsNewClaimButtonDisplayed());
}

@Given("^The user has launched the application in (.*) environment$")
public void theUserHasLaunchedTheApplicationInDevEnvironment(String Environment) {
    driver.get(configFileReader.GetApplicationBaseURL(Environment));
}
}