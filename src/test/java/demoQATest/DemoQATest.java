package demoQATest;



import baseTest.BaseTest;
import org.example.steps.PracticeFormSteps;
import org.testng.annotations.Test;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class DemoQATest extends BaseTest {

    @Test(priority = 3)
    public void happyPathSubmission() {

        PracticeFormSteps steps = new PracticeFormSteps(page);
        steps .openForm()
                .verifyPageLoaded()
                .fillName()
                .fillLastName()
                .clickGender()
                .fillEmail()
                .fillMobile()
                .fillSubject()
                .fillHobbiesMusic()
                .fillHobbiesSports()
                .fillAddress()
                .selectState()
                .selectCity()
                .submitForm()
                .verifyFormSubmittedSuccessfully();



    }

    @Test(priority = 4)
    public void shouldValidateMobileNumber() {

        PracticeFormSteps steps = new PracticeFormSteps(page);
        steps.openForm()
                .openForm()
                .fillName()
                .fillLastName()
                .fillEmail()
                .clickGender()
                .fillMobile()
                .fillSubject()
                .fillHobbiesSports()
                .fillHobbiesMusic()
                .fillAddress()
                .selectState()
                .selectCity()
                .submitForm()
                .verifyFormSubmittedSuccessfully();

    }
    @Test (priority =4 )

    public void shouldInValidateMobileNumber() {

        PracticeFormSteps steps = new PracticeFormSteps(page);
        steps.openForm()
                .openForm()
                .fillName()
                .fillLastName()
                .fillEmail()
                .clickGender()
                .fillInvalidMobile()
                .fillSubject()
                .fillHobbiesSports()
                .fillHobbiesMusic()
                .fillAddress()
                .selectState()
                .selectCity()
                .submitForm()
                .verifyFormNotSubmitted();

    }

    @Test(priority = 1)
    public void pageLoadBasicElements() {

        PracticeFormSteps steps = new PracticeFormSteps(page);
        steps.openForm()
                .verifyPageLoaded();

    }

    @Test(priority = 2)
    public void requiredieldsValidation() {

        PracticeFormSteps steps = new PracticeFormSteps(page);
        steps.openForm()
                .submitForm()
                .verifyFormNotSubmitted();
    }
}

