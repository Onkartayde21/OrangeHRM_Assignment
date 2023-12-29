import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class CandidateDetails
{
    WebDriver driver;

    public CandidateDetails(WebDriver driver)
    {
        this.driver=driver;
    }

  private  By firstname= By.xpath("//input[@name=\"firstName\"]");
    private  By middlename= By.xpath("//input[@name=\"middleName\"]");
    private  By lastname= By.xpath("//input[@name=\"lastName\"]");
    private  By email= By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input");

    private By saveButton=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[8]/button[2]");
    public void candidateDeatilsInsert(String firstName,String middleName,String lastName,String emailId)
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(firstname).sendKeys(firstName);
        driver.findElement(middlename).sendKeys(middleName);
        driver.findElement(lastname).sendKeys(lastName);
        driver.findElement(email).sendKeys(emailId);
        driver.findElement(saveButton).click();



    }


}




