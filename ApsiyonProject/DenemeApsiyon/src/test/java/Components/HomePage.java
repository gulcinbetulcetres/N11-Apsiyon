package Components;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage  {

    WebDriver driver;
    WebDriverWait wait;

    By signInButton = By.className("btnSignIn");
    By search = By.id("searchData");
    By favouriteListMenu = By.xpath("//a[contains(text(),'Hesabım')]");


    public HomePage(WebDriver driver) {

        this.driver = driver;

    }

    public void SignIn() throws InterruptedException {

       driver.findElement(signInButton).click();


    }

    public void setSearch(String data) {

        driver.findElement(search).click();
        driver.findElement(search).sendKeys(data, Keys.ENTER);

    }

    public void FavouriteListMenu() {

        WebElement element = driver.findElement(favouriteListMenu);
        Actions action = new Actions(driver);
        action.moveToElement(element);

        WebElement favouriteList = driver.findElement(By.xpath("//a[contains(text(),'Favorilerim / Listelerim')]"));
        action.moveToElement(favouriteList).click().build().perform();

    }


    public void waitModal() {

        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userKvkkModal")));

        driver.findElement(By.xpath("//span[contains(text(),'Tamam')]")).click();

    }


}