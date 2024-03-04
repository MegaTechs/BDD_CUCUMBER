package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepClass {

    @Given("User is on Home Page")
    public void user_is_on_home_page() {
        System.out.println("Success");
    }
    @When("User enters UserName and Password")
    public void user_enters_user_name_and_password() {
        System.out.println("Success");
    }
    @Then("Message displayed Login Successfully")
    public void message_displayed_login_successfully() {
        System.out.println("Success");
    }

}
