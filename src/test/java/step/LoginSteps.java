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
    public static Page page;

    @Given("user navigate to the parabankwebsite")
    public void user_navigate_to_the_parabankwebsite() {
        try (Playwright playwright = Playwright.create()) {
            // Launch browser in non-headless mode
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
            // Create a new page
            page = browser.newPage();
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
            page.fill("//input[@name='username']", "masumit1526");
            page.fill("//input[@name='password']", "masumit1526");
            page.click("//input[@type='submit']");
            // Print the page title to console
            System.out.println("Page title: " + page.title());
            // Wait for a few seconds to observe the maximized window (optional)
            page.waitForTimeout(5000);
        }
    }

    @When("user validate homepage title")
    public void user_validate_homepage_title() {
        try (Playwright playwright = Playwright.create()) {
            // Launch browser in non-headless mode
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
            // Create a new page
            Page page = browser.newPage();
            // Validate the page title
            String actualTitle = page.title();
            String expectedTitle = "ParaBank | Welcome | Online Banking";
            // Check if the actual title matches the expected title
            if (actualTitle.equals(expectedTitle)) {
                System.out.println("Title validation passed! The page title is: " + actualTitle);
            } else {
                System.out.println("Title validation failed! Expected: " + expectedTitle + ", but got: " + actualTitle);
            }

            // Optional: Take a screenshot
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("images/logo.gif")));
            // Print the actual page title
            System.out.println("Actual Page Title: " + actualTitle);
            // Optional: wait for a few seconds to observe the maximized window
            page.waitForTimeout(5000);
        }
    }

    @Then("user enters {string} username")
    public void user_enters_username(String username) {
        page.fill("//input[@name='username']", username);
        System.out.println("user enter : " + username);

    }

    @Then("user enter {string} the password")
    public void user_enter_the_password(String passwod) {
        page.fill("//input[@name='password']", passwod);
        System.out.println("user enter : " + passwod);

    }

    @Then("user click on login button")
    public void user_click_on_login_button() {
        page.click("//input[@type='submit']");
        System.out.println("user click on login button");
        System.out.println("---------------------------------");
    }

}
