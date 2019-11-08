package StepClasses;

import PageMethods.ConfigFileReader;
import PageMethods.HomePageMethods;
import PageMethods.LoginPageMethods;
import cucumber.api.java.en.Given;


public class HomePageSteps {
private ConfigFileReader configFileReader = new ConfigFileReader();

@Given("^the user has navigated to the home page as a Carrier$")
public void theUserHasNavigatedToTheHomePageAsACarrier() {
    LoginPageSteps.driver.get(configFileReader.GetApplicationBaseURL("dev"));
    LoginPageMethods.UsernameTextInput("carrier");
    LoginPageMethods.PasswordTextInput("pwd");
    LoginPageMethods.LoginButton();
}

@Given("^the user has clicked on New Claim button$")
public void theUserHasClickedOnNewClaimButton() {
    HomePageMethods.ClickNewClaimButton();
}

@Given("^the user has navigated to the home page as a Broker$")
public void theUserHasNavigatedToTheHomePageAsABroker() {
    LoginPageSteps.driver.get(configFileReader.GetApplicationBaseURL("dev"));
    LoginPageMethods.UsernameTextInput("broker");
    LoginPageMethods.PasswordTextInput("pwd");
    LoginPageMethods.LoginButton();
}
}