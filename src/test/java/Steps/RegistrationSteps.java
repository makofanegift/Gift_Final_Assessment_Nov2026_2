package Steps;

import io.cucumber.java.en.*;

public class RegistrationSteps extends Base{

    @Given("I am on home page")
    public void i_am_on_home_page() {
        homePage.verifyHomePageIsDisplayed();

    }
    @And("I click login button")
    public void i_click_login_button() {
        homePage.clickLoginButton();

    }
    @And("I click on the Sign Up Here hyperlink")
    public void i_click_on_the_sign_up_here_hyperlink() {

    }
    @And("I enter first Name (.*)$")
    public void i_enter_first_name(String firstName) {

    }
    @And("I enter Last Name (.*)$")
    public void i_enter_last_name(String lastName) {

    }
    @And("I enter Email (.*)$")
    public void i_enter_email(String email) {

    }
    @And("I enter password (.*)$")
    public void i_enter_password(String password) {

    }
    @And("I enter confirm password (.*)$")
    public void i_enter_confirm_password(String confirmPassword) {

    }
    @And("Click on dropdown to select group")
    public void click_on_dropdown_to_select_group() {

    }
    @When("I click Create Account button")
    public void i_click_create_account_button() {

    }
    @Then("I should see Registration submitted successfully popup screen")
    public void i_should_see_registration_submitted_successfully_popup_screen() {

    }
}
