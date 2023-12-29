import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchUser
{
    WebDriver driver;
    public SearchUser(WebDriver driver)
    {
        this.driver=driver;
    }

    By candidateName=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[1]/div/div[2]/div/div/input");
     By searchButton=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[4]/button[2]");


     public RecordFound SearchCandidate(String name)
     {
         driver.findElement(candidateName).sendKeys(name);
         driver.findElement(searchButton).click();
         return new RecordFound(driver);
     }
}
