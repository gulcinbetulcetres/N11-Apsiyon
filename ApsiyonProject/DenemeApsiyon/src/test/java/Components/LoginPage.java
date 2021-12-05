package Components;

import org.openqa.selenium.*;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.util.concurrent.TimeUnit;


public class LoginPage {

    WebDriver driver;

    By email = By.id("email");
    By password = By.id("password");
    By loginButton = By.id("loginButton");

    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }

    public void setEmail(String email){

        driver.findElement(this.email).sendKeys(email);

    }

    public void setPassword(String password) {

        driver.findElement(this.password).sendKeys(password);

    }

    public void login() {

        driver.findElement(loginButton).click();
    }


}
