import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddCandidate
{
    WebDriver driver;
    public AddCandidate(WebDriver driver)
    {
        this.driver=driver;
    }

    public static By addCandidate()
    {
       return By.xpath("//a[text()=\"Candidates\"]");
    }
}
