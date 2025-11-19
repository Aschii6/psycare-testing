package hooks;

import com.microsoft.playwright.*;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

public class PlaywrightHooks {
    public static Playwright playwright;
    public static Browser browser;
    public static BrowserContext context;
    public static Page page;

    @BeforeAll
    public static void setup() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(true));
        context = browser.newContext();
    }

    @Before
    public void createNewPage() {
        page = context.newPage();
    }

    @After
    public void closePage() {
        page.close();
    }

    @AfterAll
    public static void teardown() {
        context.close();
        browser.close();
        playwright.close();
    }
}
