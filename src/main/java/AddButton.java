import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddButton
{

    WebDriver driver;
    public AddButton(WebDriver driver)
    {
        this.driver=driver;
    }

     By addButton=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");
    public AddCandidate  clickAddButton()
    {
        driver.findElement(addButton).click();
        return new AddCandidate(driver);

    }
}
