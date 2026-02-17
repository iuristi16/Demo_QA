package baseTest;
import com.microsoft.playwright.*;
import org.testng.annotations.BeforeMethod;
import java.util.List;

public class BaseTest {

    protected Playwright playwright;
    protected Browser browser;
    protected Page page;

    @BeforeMethod
    public void setUp() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions()
                        .setHeadless(false)
                        .setArgs(List.of("--start-maximized"))
        );

        page = browser.newPage();
    }


}
