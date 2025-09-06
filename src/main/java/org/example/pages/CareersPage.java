package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CareersPage {

    public WebDriver driver;

    //Locator and Xpath
    public By ourLocationsBlock = By.xpath("//h3[contains(text(),'Our Locations')]/ancestor-or-self::section[@id='career-our-location']");
    public By teamsBlock = By.xpath("//a[text()='See all teams']/ancestor-or-self::section[@id='career-find-our-calling']");
    public By lifeAtInsiderBlock = By.xpath("//h2[text()='Life at Insider']/ancestor-or-self::section[@data-id='a8e7b90']");
    public By findJobButton = By.xpath("(//a[text()='Find your dream job'])[1]");

    public CareersPage(WebDriver driver){
        this.driver = driver;
    }

    //Control The All Blocks
    public boolean careerBlocksDisplayed(){

        return driver.findElement(ourLocationsBlock).isDisplayed() &&
                driver.findElement(teamsBlock).isDisplayed() &&
                driver.findElement(lifeAtInsiderBlock).isDisplayed();
    }

    //Find Job Process
    public void openFindJobsPage(){

        driver.findElement(findJobButton).click();
    }
}
