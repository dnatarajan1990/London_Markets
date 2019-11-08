package PageMethods;

import StepClasses.LoginPageSteps;
import org.openqa.selenium.By;

public class HomePageMethods {
// Home Page Selectors
private static By _newClaimButtonSelector = By.cssSelector("#home-menu-section-claims-0 > a");


//Home Page Methods
public static void ClickNewClaimButton() {
    LoginPageSteps.driver.findElement(_newClaimButtonSelector).click();
}

public static Boolean IsNewClaimButtonDisplayed() {
    boolean displayed = LoginPageSteps.driver.findElement(_newClaimButtonSelector).isDisplayed();
    return displayed;
}

public static String HomePageTitle() {
    return LoginPageSteps.driver.getCurrentUrl();
}
}