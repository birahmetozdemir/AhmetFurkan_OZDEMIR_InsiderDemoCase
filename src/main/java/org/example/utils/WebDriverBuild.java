package org.example.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBuild {

    public static WebDriver buildDriver(){

        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        //System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geckodriver.exe");
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        return driver;
    }
}