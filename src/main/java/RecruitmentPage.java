import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecruitmentPage
{

    WebDriver driver;

    public RecruitmentPage(WebDriver driver)
    {
        this.driver=driver;
    }

    By recruitmentButton= By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a/span");
    public static By recruitment()
    {
        return By.xpath("//span[text()='Recruitment']");
    }

    public AddButton clickRecruitment()
    {
        driver.findElement(recruitmentButton).click();
        return new AddButton(driver);

    }


}
