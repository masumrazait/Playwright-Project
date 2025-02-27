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

public class LoginStep {
    public static Page page;


    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
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
        }
    }

    @When("User login into application with username {string} and password {string}")
    public void user_login_into_application_with_username_and_password(String username, String password) throws InterruptedException {
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
            page.fill("//input[@name='username']", username);
            page.fill("//input[@name='password']", password);
            page.wait(5000);
            page.click("//input[@type='submit']");
            page.wait(5000);
        }
    }

    @Then("I click on the login button")
    public void i_click_on_the_login_button() {
        System.out.println("Click on the login button");
    }

    @Then("Home page should be displayed")
    public void home_page_should_be_displayed() {
        System.out.println("Home page is displayed");
    }
}