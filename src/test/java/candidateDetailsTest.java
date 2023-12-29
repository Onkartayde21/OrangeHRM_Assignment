import org.testng.annotations.Test;

public class candidateDetailsTest extends baseTest
{

    @Test
    public void addCandidateDetails()
    {
        new LoginPage(driver).performLogin("Admin", "admin123");

        new RecruitmentPage(driver).clickRecruitment();
        new AddButton(driver).clickAddButton();
       new CandidateDetails(driver).candidateDeatilsInsert("Onkar","K","Tayade","onkartayade@gmail.com");
    }
}
