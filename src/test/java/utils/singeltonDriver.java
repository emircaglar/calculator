package utils;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class singeltonDriver {
    public static WebDriver driver;

    @Before
    public static WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        driver.navigate().to("https://www.calculator.net/scientific-calculator.html");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        return driver;

    }

    @After
    public static void DriverQuit() {
        //Parent.Wait(2);
        if (driver != null) {
            driver.quit();
            driver = null;
        }

    }
}
