package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class LoginPage {
    private final Page page;
    private final Locator emailInput;
    private final Locator passwordInput;
    private final Locator loginButton;
    private final Locator signUpButton;

    public LoginPage(Page page) {
        this.page = page;

        emailInput = page.locator("input[placeholder='Email']");
        passwordInput = page.locator("input[placeholder='Password']");
        loginButton = page.getByText(
                "Sign in",
                new Page.GetByTextOptions().setExact(true)
        );
        signUpButton = page.getByText(
                "Sign Up Here",
                new Page.GetByTextOptions().setExact(true)
        );
    }

    public void loginAs(String email, String password) {
        emailInput.fill(email);
        passwordInput.fill(password);
        loginButton.click();
    }

    public void navigateToSignUpPage() {
        signUpButton.click();
    }
}