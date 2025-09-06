import org.example.pages.CareersPage;
import org.example.pages.InsiderHomePage;
import org.example.utils.WebDriverBuild;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.junit.Test;

public class InsiderDemoTest {

    @Test
    public void test(){

        WebDriver driver = WebDriverBuild.buildDriver();
        driver.get("https://useinsider.com/");

        InsiderHomePage insiderHomePage = new InsiderHomePage(driver);

        insiderHomePage.verificationMainPage();
        insiderHomePage.openCareersPage();
    }
}
