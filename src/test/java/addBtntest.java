import org.testng.Assert;
import org.testng.annotations.Test;

public class addBtntest extends baseTest
{

    @Test
    public void addBtnTest()
    {
        new LoginPage(driver).performLogin("Admin", "admin123");
        Assert.assertTrue(driver.findElement(RecruitmentPage.recruitment()).isDisplayed());
        new RecruitmentPage(driver).clickRecruitment();
        new AddButton(driver).clickAddButton();
        Assert.assertTrue(driver.findElement(AddCandidate.addCandidate()).isDisplayed());
    }
}
