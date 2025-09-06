package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InsiderHomePage {

    public WebDriver driver;

    //Locator and Xpath
    public By mainPageVerificationElement = By.xpath("//span[contains(text(),'Insider')]");
    public By companyDropdownMainMenu = By.xpath("//a[@id='navbarDropdownMenuLink' and contains(text(),'Company')]");
    public By careersSubMenu = By.xpath("//a[text()='Careers']");

    public InsiderHomePage(WebDriver driver){

        this.driver = driver;
    }

    //Verification Main Page
    public void verificationMainPage(){

        driver.findElement(mainPageVerificationElement).isDisplayed();
    }

    //Verification Page Title
    public boolean isInsiderHomePageOpened(){

        return driver.getTitle().contains("Insider");
    }

    //Follow The Career Scenario's Steps
    public void openCareersPage(){

        driver.findElement(companyDropdownMainMenu).click();
        driver.findElement(careersSubMenu).click();
    }
}
