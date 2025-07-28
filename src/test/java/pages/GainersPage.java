package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import java.util.ArrayList;
import java.util.List;

public class GainersPage {

    private Page page;
    private final String rowsXPath = "//table[@class='dataTable']/tbody/tr";

    public GainersPage(Page page) {
        this.page = page;
    }

    public static class GainerRow {
        public final double prevClose;
        public final double current;
        public final double percentChange;

        public GainerRow(double prevClose, double current, double percentChange) {
            this.prevClose = prevClose;
            this.current = current;
            this.percentChange = percentChange;
        }

        @Override
        public String toString() {
            return "PrevClose: " + prevClose + ", Current: " + current + ", %Change: " + percentChange;
        }
    }

    public List<GainerRow> getAllRows() {
        List<GainerRow> rows = new ArrayList<>();
        Locator tableRows = page.locator(rowsXPath);

        int count = tableRows.count();
        for (int i = 0; i < count; i++) {
            try {
                String prevCloseStr = tableRows.nth(i).locator("td:nth-child(5)").innerText().replace(",", "").trim();
                String currentStr = tableRows.nth(i).locator("td:nth-child(4)").innerText().replace(",", "").trim();
                String changeStr = tableRows.nth(i).locator("td:nth-child(6)").innerText().replace("%", "").trim();

                double prevClose = Double.parseDouble(prevCloseStr);
                double current = Double.parseDouble(currentStr);
                double percentChange = Double.parseDouble(changeStr);

                rows.add(new GainerRow(prevClose, current, percentChange));
            } catch (Exception e) {
                // Skip malformed rows
            }
        }
        return rows;
    }
}
