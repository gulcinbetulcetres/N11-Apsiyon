package Test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseDriver {

    public static WebDriver driver = null;

    @Before
    public void DriverIntilaze(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.n11.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @After
    public void TeardownTest()
    {
        BaseDriver.driver.quit();
    }

}

