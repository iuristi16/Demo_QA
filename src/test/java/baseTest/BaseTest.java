package baseTest;

import com.microsoft.playwright.*;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.List;

public class BaseTest {

    protected Page page;
    private Playwright playwright;
    private Browser browser;

    @BeforeMethod
    public void setUp() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions()
                        .setHeadless(true)
                        .setArgs(List.of("--start-maximized"))
        );

        page = browser.newPage();
    }


}
