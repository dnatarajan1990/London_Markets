package PageMethods;

import StepClasses.LoginPageSteps;
import org.openqa.selenium.By;

public class LoginPageMethods {

//Selectors for login page

private static By _usernameSelector = By.id("usename");
private static By _passwordSelector = By.id("password");
private static By _loginButtonSelector = By.className("button--confirm");

//Methods for login page
public static void UsernameTextInput(String username) {
    LoginPageSteps.driver.findElement(_usernameSelector).sendKeys(username);
}

public static void PasswordTextInput(String password) {
    LoginPageSteps.driver.findElement(_passwordSelector).sendKeys(password);
}

public static void LoginButton() {
    LoginPageSteps.driver.findElement(_loginButtonSelector).click();
}
}