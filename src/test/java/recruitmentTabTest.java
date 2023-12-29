import org.testng.Assert;
import org.testng.annotations.Test;

public class recruitmentTabTest extends baseTest
{

    @Test
    public void clickTest()
    {
        new LoginPage(driver).performLogin("Admin", "admin123");
        Assert.assertTrue(driver.findElement(RecruitmentPage.recruitment()).isDisplayed());

    }
}
