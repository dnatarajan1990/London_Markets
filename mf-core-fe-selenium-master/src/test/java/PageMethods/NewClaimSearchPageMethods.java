package PageMethods;

import StepClasses.LoginPageSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NewClaimSearchPageMethods {
// Selectors for NewClaim
private static By _newClaimTitleSelector = By.id("new-claim-title");
private static By _searchLabelSelector = By.id("claim-search-title");
private static By _searchInputSelector = By.id("policy-search-input");
private static By _noValidErrorMessageSelector = By.cssSelector("body > app-root > app-notification > div > div > div.message");
private static By _searchButtonSelector = By.id("search-button");
private static By _umrReferenceSelector = By.id("uniqueMarketReference-0");
private static By _startDateReferenceSelector = By.id("contractStartDate-0");
private static By _endDateReferenceSelector = By.id("contractEndDate-0");
private static By _showMoreButton = By.id("claim-search-results-0-panel");
private static By _contractNameSelector = By.id(("contractName-0"));
private static By _typeSelector = By.id("contractType-0");
private static By _treatySelector = By.id("treatyFacultative-0");
private static By _natureSelector = By.id("contractNature-0");
private static By _classContainerSelector = By.cssSelector("#claim-search-results > div");

//PageMethods
public static int NumberResultsDisplayed() {
    List<WebElement> Results = LoginPageSteps.driver.findElements(_classContainerSelector);
    int NumberResults = Results.size();
    return NumberResults;
}

public static void ClickSearchButton() {
    LoginPageSteps.driver.findElement(_searchButtonSelector).click();
}

public static void ClickShowMoreButton() {
    LoginPageSteps.driver.findElement(_showMoreButton).click();
}

public static Boolean IsContractNameDisplayed() {
    boolean displayed = LoginPageSteps.driver.findElement(_contractNameSelector).isDisplayed();
    return displayed;
}

public static Boolean IsContracttypeTextDisplayed() {
    boolean displayed = LoginPageSteps.driver.findElement(_typeSelector).isDisplayed();
    return displayed;
}

public static Boolean IsTreatyTextDisplayed() {
    boolean displayed = LoginPageSteps.driver.findElement(_treatySelector).isDisplayed();
    return displayed;
}

public static Boolean IsNatureTextDisplayed() {
    boolean displayed = LoginPageSteps.driver.findElement(_natureSelector).isDisplayed();
    return displayed;
}

public static Boolean IsUMRReferenceDisplayed() {
    boolean displayed = LoginPageSteps.driver.findElement(_umrReferenceSelector).isDisplayed();
    return displayed;
}

public static Boolean IsStartDateTextDisplayed() {
    boolean displayed = LoginPageSteps.driver.findElement(_startDateReferenceSelector).isDisplayed();
    return displayed;
}

public static Boolean IsEndDateTextDisplayed() {
    boolean displayed = LoginPageSteps.driver.findElement(_endDateReferenceSelector).isDisplayed();
    return displayed;
}

public static Boolean IsNewClaimTitleDisplayed() {
    boolean displayed = LoginPageSteps.driver.findElement(_newClaimTitleSelector).isDisplayed();
    return displayed;
}

public static Boolean IsSearchLabelDisplayed() {
    boolean displayed = LoginPageSteps.driver.findElement(_searchLabelSelector).isDisplayed();
    return displayed;
}

public static Boolean IsNoValidErrorMessageDisplayed() {
    boolean displayed = LoginPageSteps.driver.findElement(_noValidErrorMessageSelector).isDisplayed();
    return displayed;
}

public static void InputRiskSearch(String searchInput) {
    LoginPageSteps.driver.findElement(_searchInputSelector).sendKeys(searchInput);
}
}