package tests.setup;

import com.microsoft.playwright.*;

import java.nio.file.Paths;

public class AuthSetup {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create();
             Browser browser = playwright.chromium().launch(
                        new BrowserType.LaunchOptions()
             )
        ) {
            BrowserContext context = browser.newContext();
            Page page = context.newPage();

            page.navigate("http://localhost:8081/LoginPage");
            page.fill("input[placeholder='Email']", "le.da@le.da");
            page.fill("input[placeholder='Password']", "LecheaD1!");
            page.click("div:has-text('Sign in')");

            page.waitForURL("**/HomePage");

            context.storageState(
                    new BrowserContext.StorageStateOptions()
                            .setPath(Paths.get("src/test/resources/auth.json"))
            );
        }
    }
}
