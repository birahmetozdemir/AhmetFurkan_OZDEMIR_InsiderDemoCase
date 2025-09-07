package org.example.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBuild {

    public static WebDriver buildDriver(){

        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver-140.0.7339.80.exe");
        //System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geckodriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);
        //WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        return driver;
    }
}