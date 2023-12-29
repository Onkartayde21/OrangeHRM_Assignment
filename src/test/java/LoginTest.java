import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends baseTest
{
@Test
public void validLogin()
{
    new LoginPage(driver).performLogin("Admin", "admin123");
    Assert.assertTrue(driver.findElement(RecruitmentPage.recruitment()).isDisplayed());

}

@Test
    public void invalidLogin()
{
    new LoginPage(driver).performLogin("Admin", "admin12");
    Assert.assertTrue((driver.findElement(LoginPage.error())).isDisplayed());
}



}
