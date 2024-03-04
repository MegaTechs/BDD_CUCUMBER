package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CapitalOneCopy {

    @Given("new User is on Home Page")
    public void new_user_is_on_home_page() {


        System.out.println("Success");

    }

    @Given("Then user need to click on Registration button")
    public void then_user_need_to_click_on_registration_button() {
        System.out.println("Success");
    }
    @When("new  User enters UserName and Password")
    public void new_user_enters_user_name_and_password() {
        System.out.println("Success");


    }
    @Then("new  Message displayed Login Successfully")
    public void new_message_displayed_login_successfully() {

        System.out.println("Success");

    }



    @Then("we can see the success Message")
    public void we_can_see_the_success_message() {
        System.out.println("Success");
    }

}
