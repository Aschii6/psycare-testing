package tests;

import base.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.ExplorePage;

public class MapTests extends BaseTest {
    ExplorePage explorePage;

    @BeforeEach
    public void setUpTest() {
        changeContextWithStorageState("src/test/resources/auth.json");
        page.navigate("http://localhost:8081/ExplorePage");
        page.waitForURL("**/ExplorePage");
        explorePage = new ExplorePage(page);
    }

    @Test
    @DisplayName("TC-004: Assign a Client")
    public void assignClientTest() {
        explorePage.assignClient("Pa");
        page.waitForURL("**/ExplorePage");
    }

    @Test
    @DisplayName("TC-005: Unassign a Client")
    public void unassignClientTest() {
        explorePage.unassignClient("Pa");
        page.waitForURL("**/HomePage");
    }
}
