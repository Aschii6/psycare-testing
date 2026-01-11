package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class CYRPage {
    private final Page page;
    private final Locator clientRoleCard;
    private final Locator continueButton;

    public CYRPage(Page page) {
        this.page = page;
        clientRoleCard = page.locator("div[data-expoimage=\"true\"] img").last();
        continueButton = page.getByText(
                "Continue",
                new Page.GetByTextOptions().setExact(true)
        );
    }

    public void selectClientRole() {
        clientRoleCard.click();
        continueButton.click();
    }
}
