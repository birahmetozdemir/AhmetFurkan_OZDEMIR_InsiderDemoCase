package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class FindJobsPage {

    public WebDriver driver;

    //Locator and Xpath
    public By filterByLocation = By.id("select2-filter-by-location-container");
    public By filteredLocationIstanbul = By.xpath("//li[text()='Istanbul, Turkiye']");
    public By filterByDepartment = By.id("select2-filter-by-department-container");
    public By filteredDepartmentQA = By.xpath("//li[text()='Quality Assurance']");
    public By filteredQAList = By.xpath("(//div[@data-location='istanbul-turkiye' and @data-team='qualityassurance'])[1]");
    public By viewRoleButton = By.xpath("(//a[text()='View Role'])[1]");

    public FindJobsPage(WebDriver driver){

        this.driver = driver;
    }

    //All Filter Transactions
    public void allFilters(){

        driver.findElement(filterByLocation).click();
        driver.findElement(filteredLocationIstanbul).click();

        driver.findElement(filterByDepartment).click();
        driver.findElement(filteredDepartmentQA).click();
    }

    //Filter Result List
    public void filteredQAList(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(filteredQAList));

        driver.findElement(viewRoleButton).click();
    }
}
