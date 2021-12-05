package Components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SearchList {

    WebDriver driver;

    By resultText = By.className("resultText");
    By pagination = By.xpath("//div[@class='pagination']/a[3]");
    By favouriteButton = By.xpath("//div[@id='view']/ul[1]/li[3]/div[1]/div[1]/span[1]");
    By favouriteProduct = By.xpath("//div[@id='view']/ul[1]/li[3]/div[1]/div[1]/a/h3");


    public SearchList(WebDriver driver) {

        this.driver = driver;
    }

    public String getResultText() {

        return driver.findElement(resultText).getText().split(" ")[3];

    }

    public void clickPage() {

        driver.findElement(pagination).click();
    }

    public void clickFavourite() {

        driver.findElement(favouriteButton).click();
    }

    public String expectedProductName() {

        return driver.findElement(favouriteProduct).getText();

    }


}
