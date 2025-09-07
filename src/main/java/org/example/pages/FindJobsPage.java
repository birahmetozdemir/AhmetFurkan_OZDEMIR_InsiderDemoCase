package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class FindJobsPage {

    public WebDriver driver;

    //Locator and Xpath
    public By defaultResult = By.xpath("//span[text()='NaN - NaN']");
    public By filterByLocation = By.id("select2-filter-by-location-container");
    public By filteredLocationIstanbul = By.xpath("//li[text()='Istanbul, Turkiye']");
    public By filterByDepartment = By.id("select2-filter-by-department-container");
    public By filteredDepartmentQA = By.xpath("//li[text()='Quality Assurance']");
    public By viewRoleButton = By.xpath("(//a[@target='_blank' and text()='View Role'])[last()]");

    public FindJobsPage(WebDriver driver){

        this.driver = driver;
    }

    public void allFilters() throws InterruptedException {

        //All Filter Transactions
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(defaultResult));
        driver.findElement(defaultResult).click();

        driver.findElement(filterByLocation).click();
        wait.until(ExpectedConditions.elementToBeClickable(filteredLocationIstanbul));
        driver.findElement(filteredLocationIstanbul).click();
        Thread.sleep(3000);

        wait.until(ExpectedConditions.elementToBeClickable(filterByDepartment));
        driver.findElement(filterByDepartment).click();
        wait.until(ExpectedConditions.elementToBeClickable(filteredDepartmentQA));
        driver.findElement(filteredDepartmentQA).click();
        Thread.sleep(3000);

        //Scroll The Element
        WebElement viewRoleBlock = driver.findElement(viewRoleButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", viewRoleBlock);
        Thread.sleep(3000);

        //Get Link in QA Block
        String href = viewRoleBlock.getAttribute("href");
        ((JavascriptExecutor) driver).executeScript("window.open(arguments[0], '_blank');", href);
    }
}