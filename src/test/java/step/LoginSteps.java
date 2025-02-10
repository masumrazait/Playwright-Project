package step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("user navigate to the parabankwebsite")
    public void user_navigate_to_the_parabankwebsite() {
        System.out.println("user navigate to the parabankwebsite");
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
