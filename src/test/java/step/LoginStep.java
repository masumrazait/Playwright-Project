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
        System.out.println("I am on the login page");
    }

    @When("User login into application with username {string} and password {string}")
    public void user_login_into_application_with_username_and_password(String username, String password) {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
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