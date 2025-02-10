package step;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.awt.*;
import java.nio.file.Paths;

public class LoginSteps {
    @Given("user navigate to the parabankwebsite")
    public void user_navigate_to_the_parabankwebsite() {
        try (Playwright playwright = Playwright.create()) {
            // Launch browser in non-headless mode
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
            // Create a new page
            Page page = browser.newPage();

            // Get the screen size dynamically using java.awt.Toolkit
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int screenWidth = screenSize.width;
            int screenHeight = screenSize.height;

            // Set the viewport size to match the system screen size (maximized)
            page.setViewportSize(screenWidth, screenHeight);

            // Navigate to the URL
            page.navigate("https://parabank.parasoft.com/parabank/index.htm");

            // Take a screenshot
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("images/logo.gif")));

            // Print the page title to console
            System.out.println("Page title: " + page.title());

            // Wait for a few seconds to observe the maximized window (optional)
            page.waitForTimeout(5000);
        }
    }

    @When("user validate homepage title")
    public void user_validate_homepage_title() {
        System.out.println("user validate homepage title");

    }

    @Then("user enters {string} username")
    public void user_enters_username(String username) {
        System.out.println("user enter : " + username);

    }

    @Then("user enter {string} the password")
    public void user_enter_the_password(String passwod) {
        System.out.println("user enter : " + passwod);

    }

    @Then("user click on login button")
    public void user_click_on_login_button() {
        System.out.println("user click on login button");
        System.out.println("---------------------------------");
    }

}
