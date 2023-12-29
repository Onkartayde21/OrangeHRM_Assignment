import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecordFound
{
    WebDriver driver;
    public RecordFound(WebDriver driver)
    {
        this.driver=driver;
    }


    public static By foundRecord()
    {
        return By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span");
    }



}


