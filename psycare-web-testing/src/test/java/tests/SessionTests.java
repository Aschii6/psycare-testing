package tests;

import base.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.AddUpdateEventPage;
import pages.HomePage;

public class SessionTests extends BaseTest {
    HomePage homePage;

    @BeforeEach
    public void setUpTest() {
        changeContextWithStorageState("src/test/resources/auth.json");
        page.navigate("http://localhost:8081/HomePage");
        page.waitForURL("**/HomePage");
    }

    @Test
    @DisplayName("TC-003: Add A Session")
    public void addSessionTest() {
        homePage = new HomePage(page);
        homePage.clickAddSession();
        page.waitForURL("**/AddUpdateEventPage");
        AddUpdateEventPage addUpdateEventPage = new AddUpdateEventPage(page);
        addUpdateEventPage.fillEventForm(
                "Therapy Session",
                "2026-01-16",
                "10:00",
                "11:00",
                "Cli",
                "https://meet.example.com/session"
        );

        page.waitForURL("**/HomePage");
    }
}
