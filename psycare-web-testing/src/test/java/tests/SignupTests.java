package tests;

import base.BaseTest;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.CYRPage;
import pages.ClientSignUpPage;
import pages.LoginPage;

public class SignupTests extends BaseTest {
    LoginPage lPage;
    CYRPage cyrPage;
    ClientSignUpPage csuPage;

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
        lPage = new LoginPage(page);
        lPage.navigateToSignUpPage();
        page.waitForURL("**/ChooseYourRolePage");
        cyrPage = new CYRPage(page);
    }

    @Test
    @DisplayName("TC-002: Successful Client Signup")
    public void successfulClientSignup() {
        cyrPage.selectClientRole();
        page.waitForURL("**/ClientSignUpPage");
        csuPage = new ClientSignUpPage(page);
        csuPage.fillSignUpForm(
                "TestName",
                "TestSurname",
                "test@test.com",
                "0712345678",
                "TestPass1!"
        );
        csuPage.fillEmergencyContactInfo(
                "EmergName",
                "EmergSurname",
                "emerg@emerg.com",
                "0798765432"
        );
        page.waitForURL("**/LoginPage");
    }
}
