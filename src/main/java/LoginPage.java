import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class LoginPage
{
    WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }

    private By userNameInput= By.xpath("//input[@placeholder=\"Username\"]");
    private By passwordInput= By.xpath("//input[@placeholder=\"Password\"]");
     private By loginButton = By.xpath("//button[@type=\"submit\"]");

    public RecruitmentPage performLogin(String username,String password)
    {
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(userNameInput).sendKeys(username);


        driver.findElement(passwordInput).sendKeys(password);


        driver.findElement(loginButton).click();

        return new RecruitmentPage(driver);

    }
    public static By error()
    {
        By errorMsg = By.xpath("//div[@class='oxd-alert-content oxd-alert-content--error']");
        return errorMsg;
    }
}
