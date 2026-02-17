package org.example.steps;


import com.microsoft.playwright.Page;
import org.example.data.Constants;
import org.example.pages.PracticeFormPage;
import org.example.data.TestData;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;




public class PracticeFormSteps extends PracticeFormPage {
    private final Page page;

    public PracticeFormSteps(Page page) {
        super(page);
        this.page = page;
    }

       public PracticeFormSteps openForm() {
           page.navigate(Constants.BASE_URL);
           formsCard().click();
           practiceFormMenu().click();
           return this;
       }


    public PracticeFormSteps fillName() {
        firstName().fill(TestData.FIRST_NAME);
        return this;
    }

    public PracticeFormSteps fillLastName() {
        lastName().fill(TestData.LAST_NAME);
        return this;
    }

    public PracticeFormSteps fillEmail() {
        email().fill(TestData.EMAIL);
        return this;
    }

    public PracticeFormSteps clickGender() {
        genderFemale().click();
        return this;
    }

    public PracticeFormSteps clickGender1() {
        genderMale().click();
        return this;
    }

    public PracticeFormSteps clickGender2() {
        genderOther().click();
        return this;
    }

    public PracticeFormSteps fillMobile() {
        mobileNumber().fill(TestData.MOBILE);
        return this;
    }

    public PracticeFormSteps fillInvalidMobile() {
        mobileNumber1().fill(TestData.INVALID_MOBILE);
        return this;
    }

    public PracticeFormSteps fillSubject() {
        subjectsInput().fill(TestData.SUBJECT);
        return this;
    }

    public PracticeFormSteps fillHobbiesSports() {
        hobbiesSports().click();
        return this;
    }

    public PracticeFormSteps fillHobbiesMusic() {
        hobbiesMusic().click();
        return this;
    }

    public PracticeFormSteps fillAddress() {
        address().fill(TestData.ADDRESS);
        return this;
    }

    public PracticeFormSteps selectState() {
        stateDropdown().scrollIntoViewIfNeeded();
        stateDropdown().click();
        page.getByText(TestData.STATE).click();
        return this;
    }

    public PracticeFormSteps selectCity() {
        cityDropdown().click();
        page.getByText(TestData.CITY).click();
        return this;
    }

        public PracticeFormSteps submitForm () {
            submitButton().scrollIntoViewIfNeeded();
            submitButton().click();
            return this;
        }


        public PracticeFormSteps verifyPageLoaded () {
        assertThat(page).hasURL(Constants.PRACTICE_FORM_URL);

            assertThat(firstName()).isVisible();
            assertThat(firstName()).isEnabled();

            assertThat(lastName()).isVisible();
            assertThat(lastName()).isEnabled();

            assertThat(email()).isVisible();
            assertThat(email()).isEnabled();

            assertThat(mobileNumber()).isVisible();
            assertThat(mobileNumber()).isEnabled();

            assertThat(genderFemale()).isVisible();
            assertThat(genderFemale()).isEnabled();

            assertThat(genderMale()).isVisible();
            assertThat(genderMale()).isEnabled();

            assertThat(genderOther()).isVisible();
            assertThat(genderOther()).isEnabled();


            assertThat(submitButton()).isVisible();
            assertThat(submitButton()).isEnabled();
            return this;
        }

        public PracticeFormSteps verifyFormSubmittedSuccessfully () {
            assertThat(successModalTitle())
                    .hasText(TestData.SUCCESS_MESSAGE);
            return this;
        }
    public PracticeFormSteps verifyFormNotSubmitted() {
        assertThat(successModalTitle()).not().isVisible();
        return this;
    }



    public PracticeFormSteps verifyModalData() {

        assertThat(modalValueByLabel("Student Name"))
                .hasText(TestData.FIRST_NAME + " " + TestData.LAST_NAME);

        assertThat(modalValueByLabel("Student Email"))
                .hasText(TestData.EMAIL);

        assertThat(modalValueByLabel("Gender"))
                .hasText("Female");

        assertThat(modalValueByLabel("Mobile"))
                .hasText(TestData.MOBILE);

       // assertThat(modalValueByLabel("Subjects"))
                //.hasText(TestData.SUBJECT);

        assertThat(modalValueByLabel("Hobbies"))
                .containsText(TestData.HOBBY_MUSIC);

        assertThat(modalValueByLabel("Hobbies"))
                .containsText(TestData.HOBBY_SPORTS);


        assertThat(modalValueByLabel("Address"))
                .hasText(TestData.ADDRESS);

        assertThat(modalValueByLabel("State and City"))
                .hasText(TestData.STATE + " " + TestData.CITY);
        return this;
    }


}

