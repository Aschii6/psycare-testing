package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class HomePage {
    private final Page page;
    private final Locator addSessionButton;

    public HomePage(Page page) {
        this.page = page;

        addSessionButton = page.locator("div[data-expoimage=\"true\"] img[src*=\"plus.png\"]");
    }

    public void clickAddSession() {
        addSessionButton.click();
    }
}
