package StepClasses;

import PageMethods.NewClaimSearchPageMethods;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class NewClaimSearchPageSteps {

@When("^the user clicks on an individual risk$")
public void theUserClicksOnAnIndividualRisk() {
}

@When("^the user search the Risks for (.*)$")
public void theUserSearchTheRisksForSearchInput(String SearchInput) throws Throwable {
    NewClaimSearchPageMethods.InputRiskSearch(SearchInput);
}

@When("^clicks on Search Button$")
public void clickOnSearchButton() {
    NewClaimSearchPageMethods.ClickSearchButton();
}

@When("^the user clicks on Show More button on the displayed result$")
public void theUserClicksOnShowMoreButtonOnTheDisplayedResult() {
    NewClaimSearchPageMethods.ClickShowMoreButton();
}

@Then("^the Search label should be displayed$")
public void theSearchLabelShouldBeDisplayed() {
    assertTrue(NewClaimSearchPageMethods.IsSearchLabelDisplayed());
}

@Then("^the New Claim search page should be displayed$")
public void theNewClaimSearchPageShouldBeDisplayed() {
    assertTrue(NewClaimSearchPageMethods.IsNewClaimTitleDisplayed());
}

@Then("^the 'Insurances not Found' error message should be displayed$")
public void theNoValidResultsErrorMessageShouldBeDisplayed() throws Throwable {
    assertTrue(NewClaimSearchPageMethods.IsNoValidErrorMessageDisplayed());
}

@Then("^the UMR reference will be displayed$")
public void theUMRReferenceWillBeDisplayed() {
    assertTrue(NewClaimSearchPageMethods.IsUMRReferenceDisplayed());
}

@Then("^the start date will be displayed$")
public void theStartDateWillBeDisplayed() {
    assertTrue(NewClaimSearchPageMethods.IsStartDateTextDisplayed());
}

@Then("^the end date will be displayed$")
public void theEndDateWillBeDisplayed() {
    assertTrue(NewClaimSearchPageMethods.IsEndDateTextDisplayed());
}

@Then("^the Contract Name should be displayed$")
public void theContractNameShouldBeDisplayed() {
    assertTrue(NewClaimSearchPageMethods.IsContractNameDisplayed());
}

@Then("^the Type should be displayed$")
public void theTypeShouldBeDisplayed() {
    assertTrue(NewClaimSearchPageMethods.IsContracttypeTextDisplayed());
}

@Then("^the Treaty Faculative should be displayed$")
public void theTreatyFaculativeShouldBeDisplayed() {
    assertTrue(NewClaimSearchPageMethods.IsTreatyTextDisplayed());
}

@Then("^the Nature should be displayed$")
public void theNatureShouldBeDisplayed() {
    assertTrue(NewClaimSearchPageMethods.IsNatureTextDisplayed());
}

@Then("^number of results displayed should be (.*)$")
public void numberOfResultsDisplayedShouldBeNumberOfRows(int NumberOfRows) {
    assertSame(NumberOfRows, NewClaimSearchPageMethods.NumberResultsDisplayed());
}
}