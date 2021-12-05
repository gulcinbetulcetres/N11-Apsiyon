package Test;

import Components.*;
import org.junit.Assert;
import org.junit.Test;

public class Runner extends BaseDriver {
    HomePage homePage;
    LoginPage loginPage;
    SearchList searchList;
    FavouriteList favouriteList;
    Favourite favourite;


    @Test
    public void verifyHomePage()  {
        homePage = new HomePage(driver);
        Assert.assertEquals(driver.getTitle(), "n11.com - Hayat Sana Gelir");
    }
    @Test
    public void main() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.SignIn();
        loginPage = new LoginPage(driver);
        loginPage.setEmail("generator@gmail.com");
        loginPage.setPassword("123a123a");
        loginPage.login();

    }
    @Test
    public void verifySearchBar()   {
        homePage = new HomePage(driver);
        searchList = new SearchList(driver);
        homePage.setSearch("samsung");
        Assert.assertEquals(searchList.getResultText(), "bulundu.");
    }

    @Test
    public void verifyPageTwo(){
        homePage = new HomePage(driver);
        searchList = new SearchList(driver);
        searchList.clickPage();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.n11.com/arama?q=samsung&pg=2");
    }

    @Test
    public void verifyFavouriteProduct()  {
        homePage = new HomePage(driver);
        searchList = new SearchList(driver);
        favouriteList = new FavouriteList(driver);
        favourite = new Favourite(driver);


        searchList.clickFavourite();
        String expectedProductName = searchList.expectedProductName();
        homePage.FavouriteListMenu();
        favouriteList = new FavouriteList(driver);
        favouriteList.showDetailFavourite();
        favourite = new Favourite(driver);
        Assert.assertEquals(favourite.actualProductName(), expectedProductName);
    }

    @Test
    public void verifyDeleteProduct() throws InterruptedException {

        favourite.deleteFavourite();
        Assert.assertTrue(favourite.isFavouriteProduct());
    }

}
