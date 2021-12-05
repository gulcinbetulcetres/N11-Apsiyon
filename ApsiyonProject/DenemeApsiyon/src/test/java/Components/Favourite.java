package Components;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Favourite {

    WebDriver driver;
    WebDriverWait wait;

    By favouriteItem = By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/div[3]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/a[1]/h3[1]");
    By deleteButton = By.className("deleteProFromFavorites");
    By emptyWatchList = By.className("emptyWatchList");
    Alert alert;


    public Favourite(WebDriver driver) {

        this.driver = driver;
    }

    public String actualProductName() {


        return driver.findElement(favouriteItem).getText();


    }


    public void deleteFavourite() {

        driver.findElement(deleteButton).click();
        driver.findElement(By.className("btnHolder")).click();
    }

    public boolean isFavouriteProduct() {

        String emptyText = driver.findElement(emptyWatchList).getText();
        return emptyText.equals("İzlediğiniz bir ürün bulunmamaktadır.");

    }


}