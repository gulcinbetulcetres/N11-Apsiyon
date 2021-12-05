package Components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FavouriteList {


    WebDriver driver;
    By favouriteListButton = By.xpath("//ul[@class= 'wishGroupList']/li[1]/div/a");


    public FavouriteList(WebDriver driver) {
        this.driver = driver;
    }

    public void showDetailFavourite() {

        driver.findElement(favouriteListButton).click();
    }


}
