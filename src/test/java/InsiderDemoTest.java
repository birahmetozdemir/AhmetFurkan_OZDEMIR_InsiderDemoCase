import org.example.pages.ApplicationFormPage;
import org.example.pages.CareersPage;
import org.example.pages.FindJobsPage;
import org.example.pages.InsiderHomePage;
import org.example.utils.WebDriverBuild;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.junit.Test;

public class InsiderDemoTest {

    @Test
    public void test() throws InterruptedException {

        WebDriver driver = WebDriverBuild.buildDriver();
        driver.get("https://useinsider.com/");

        InsiderHomePage insiderHomePage = new InsiderHomePage(driver);

        insiderHomePage.verificationMainPage();
        Assert.assertTrue("Insider home page is opened", insiderHomePage.isInsiderHomePageOpened());
        insiderHomePage.openCareersPage();

        CareersPage careersPage = new CareersPage(driver);
        Assert.assertTrue("All blocks are opened", careersPage.careerBlocksDisplayed());
        careersPage.openFindJobsPage();

        FindJobsPage findJobsPage = new FindJobsPage(driver);
        findJobsPage.allFilters();

        ApplicationFormPage applicationFormPage = new ApplicationFormPage(driver);
        applicationFormPage.connectApplicationFormTab();
    }
}
