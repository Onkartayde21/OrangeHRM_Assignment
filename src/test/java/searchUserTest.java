import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class searchUserTest extends baseTest
{

    @Test
    public void Search()
    {
        new LoginPage(driver).performLogin("Admin", "admin123");

        new RecruitmentPage(driver).clickRecruitment();
        new AddButton(driver).clickAddButton();
        new CandidateDetails(driver).candidateDeatilsInsert("Onkar","Karbhari","Tayade","onkartayade@gmail.com");
        new RecruitmentPage(driver).clickRecruitment();
        new SearchUser(driver).SearchCandidate("Onkar Karbhari Tayade");
        // there is a bug in OrangeHRM site at the search side of then when we enter name manually we get invalid message but only get seacherd if we select name from given suggestion
    }
}
