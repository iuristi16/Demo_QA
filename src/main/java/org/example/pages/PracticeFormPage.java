package org.example.pages;



import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.example.data.Constants;


public class PracticeFormPage {

    private final Page page;

    public PracticeFormPage(Page page) {
        this.page = page;
    }


    public Locator firstName() {
        return page.locator("#firstName");
    }

    public Locator lastName() {
        return page.locator("#lastName");
    }

    public Locator email() {
        return page.locator("#userEmail");
    }

    public Locator genderFemale() {
        return page.locator("label[for='gender-radio-2']");


    }

    public Locator mobileNumber() {
        return page.locator("#userNumber");
    }

    public Locator subjectsInput() {
        return page.locator("#subjectsInput");
    }

    public Locator hobbiesSports() {
        return page.locator("label:text('Sports')");
    }

    public Locator hobbiesMusic() {
        return page.locator("label:text('Music')");
    }

    public Locator address() {
        return page.locator("#currentAddress");
    }

    public Locator stateDropdown() {
        return page.locator("#state");
    }

    public Locator stateOption(String state) {
        return page.locator("div.css-1n7v3ny-option")
                .filter(new Locator.FilterOptions().setHasText(state));
    }

    public Locator cityDropdown() {
        return page.locator("#city");
    }

    public Locator cityOption(String city) {
        return page.locator("div.css-1n7v3ny-option")
                .filter(new Locator.FilterOptions().setHasText(city));
    }


    public Locator submitButton() {
        return page.locator("#submit");
    }

    public Locator mobileNumber1() {
        return page.locator("#userNumber");
    }
    public Locator successModalTitle() {
        return page.locator(".modal-title");
    }


    }

