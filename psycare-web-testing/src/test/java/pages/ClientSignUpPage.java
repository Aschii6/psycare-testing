package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class ClientSignUpPage {
    private final Page page;
    private final Locator nameInput;
    private final Locator surnameInput;
    private final Locator emailInput;
    private final Locator phoneInput;
    private final Locator passwordInput;
    private final Locator continueButton;

    public ClientSignUpPage(Page page) {
        this.page = page;
        nameInput = page.locator("input[placeholder='Name']");
        surnameInput = page.locator("input[placeholder='Surname']");
        emailInput = page.locator("input[placeholder='Email']").last();
        phoneInput = page.locator("input[placeholder='Phone']").last();
        passwordInput = page.locator("input[placeholder='Password']").last();
        continueButton = page.getByText(
                "Continue",
                new Page.GetByTextOptions().setExact(true)
        ).last();
    }

    public void fillSignUpForm(String name, String surname, String email, String phone, String password) {
        nameInput.fill(name);
        surnameInput.fill(surname);
        emailInput.fill(email);
        phoneInput.fill(phone);
        passwordInput.fill(password);
        continueButton.click();
    }

    public void fillEmergencyContactInfo(String name, String surname, String email, String phone) {
        page.locator("input[placeholder='Name']").last().fill(name);
        page.locator("input[placeholder='Surname']").last().fill(surname);
        page.locator("input[placeholder='Email']").last().fill(email);
        page.locator("input[placeholder='Phone']").last().fill(phone);
        page.getByText(
                "Save",
                new Page.GetByTextOptions().setExact(true)
        ).last().click();
    }
}
