package tests;

import base.BaseTest;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

public class LoginTests extends BaseTest {
    LoginPage loginPage;

    @BeforeEach
    public void setUpTest() {
        page.navigate("http://localhost:8081/LoginPage");
        try {
            page.getByText(
                    "Minimize",
                    new Page.GetByTextOptions().setExact(true)
            ).click(new Locator.ClickOptions().setTimeout(1000));
        } catch (Exception e) {
            // If the pop-up is not present, continue without throwing an error
        }
        loginPage = new LoginPage(page);
    }

    @Test
    @DisplayName("TC-001: Successful Psychologist Login")
    public void successfulLoginTest() {
        loginPage.loginAs("le.da@le.da", "LecheaD1!");

        page.waitForURL("**/HomePage");
    }
}
