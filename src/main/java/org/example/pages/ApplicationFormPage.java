package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class ApplicationFormPage {

    public WebDriver driver;

    //Locator and Xpath
    public By verificationApplyForThisJobButton = By.xpath("(//a[text()='Apply for this job'])[1]");

    public ApplicationFormPage(WebDriver driver){

        this.driver = driver;
    }

    //Open Application Form Tab and Verification
    public void connectApplicationFormTab(){

        Set<String> windowHandles = driver.getWindowHandles();
        String currentTab = driver.getWindowHandle();

        for (String handle : windowHandles){

            if (!handle.equals(currentTab)){

                driver.switchTo().window(handle);
                break;
            }
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.findElement(verificationApplyForThisJobButton).isDisplayed();
        wait.until(ExpectedConditions.elementToBeClickable(verificationApplyForThisJobButton));

        driver.quit();
    }
}
