package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class ExplorePage {
    private final Page page;
    private final Locator searchInput;

    public ExplorePage(Page page) {
        this.page = page;

        searchInput = page.locator("input[placeholder='Search']");
    }

    public void assignClient(String clientName) {
        searchInput.fill(clientName);
//        page.locator("div[data-expoimage=\"true\"] img[src*=\"profilePicture.png\"]").first().click();
        page.getByText(clientName).click();

        page.getByText(
                "Yes",
                new Page.GetByTextOptions().setExact(true)
        ).click();
    }

    public void unassignClient(String clientName) {
        page.getByText(clientName).click();
        page.waitForURL("**/ViewClientDetailsPage?*");
        page.getByText("UNASSIGN").click();
    }
}
