package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CareersPage {

    public WebDriver driver;

    public By ourLocationsBlock = By.xpath("//h3[contains(text(),'Our Locations')]/ancestor-or-self::section[@id='career-our-location']");
    public By teamsBlock = By.xpath("?");
    public By lifeAtInsiderBlock = By.id("a8e7b90");
}
