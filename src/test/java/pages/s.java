package pages;

import com.microsoft.playwright.Page;
import io.cucumber.java.en.*;
import static org.junit.Assert.*;

import java.util.List;

public class s {

    Page page;
    GainersPage gainersPage;

    @Given("I open the Rediff gainers page")
    public void i_open_the_rediff_gainers_page() {
        page = aa.getPage();
        page.navigate("https://money.rediff.com/gainers");
        gainersPage = new GainersPage(gainersPage);
    }

    @Then("I verify all % Change values are correct")
    public void i_verify_all_change_values_are_correct() {
        List<GainersPage.GainerRow> rows = gainersPage.getAllRows();
        for (GainersPage.GainerRow row : rows) {
            double expectedChange = ((row.current - row.prevClose) / row.prevClose) * 100;
            expectedChange = Math.round(expectedChange * 100.0) / 100.0;

            double actual = Math.round(row.percentChange * 100.0) / 100.0;

            assertEquals("Mismatch for row: " + row, expectedChange, actual, 0.2);
        }
    }
}
