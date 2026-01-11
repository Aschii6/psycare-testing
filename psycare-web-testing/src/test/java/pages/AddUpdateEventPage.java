package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class AddUpdateEventPage {
    private final Page page;
    private final Locator titleInput;
    private final Locator dateInput;
    private final Locator startTimeInput;
    private final Locator endTimeInput;
    private final Locator clientSearchInput;
    private final Locator meetLinkInput;
    private final Locator saveButton;

    public AddUpdateEventPage(Page page) {
        this.page = page;

        titleInput = page.locator("input[placeholder='Add title']");
        dateInput = page.locator("input[type='date']");
        startTimeInput = page.locator("input[type='time']").nth(0);
        endTimeInput = page.locator("input[type='time']").nth(1);
        clientSearchInput = page.locator("input[placeholder='Search']");
        meetLinkInput = page.locator("input[placeholder='Add link']");
        saveButton = page.getByText(
                "Save",
                new Page.GetByTextOptions().setExact(true)
        );
    }

    public void fillEventForm(
            String title,
            String date,
            String startTime,
            String endTime,
            String clientName,
            String meetLink
    ) {
        titleInput.fill(title);
        dateInput.fill(date);
        startTimeInput.fill(startTime);
        endTimeInput.fill(endTime);
        clientSearchInput.fill(clientName);

        page.locator("div[data-expoimage=\"true\"] img[src*=\"profilePicture.png\"]").last().click();

        meetLinkInput.fill(meetLink);
        saveButton.click();
    }
}
