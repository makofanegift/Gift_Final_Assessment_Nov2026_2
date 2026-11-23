package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage{

    @FindBy(id = "signup-toggle")
    WebElement SignUpHereHyperLinkId;

    @FindBy(id = "register-firstName")
    WebElement registerFirstNameId;

    @FindBy(id = "register-lastName")
    WebElement registerLastNameId;

    @FindBy(id = "register-email")
    WebElement registerEmailId;

    @FindBy(id = "register-password")
    WebElement registerPasswordId;

    @FindBy(id = "register-confirmPassword")
    WebElement registerConfirmPasswordId;

    @FindBy(id = "register-group")
    WebElement registerSelectGroupDropdownId;

    public RegistrationPage(WebDriver driver){
        super(driver);
    }

    public void clickOnSignUpHereHyperLink(){
        click(SignUpHereHyperLinkId);

    }

    public void enterFirstName (String firstName){
        enterText(registerFirstNameId, firstName);

    }
    public void enterLastName (String lastName){
        enterText(registerLastNameId, lastName);

    }

    public void enterEmail (String email){
        enterText(registerEmailId, email);

    }

    public void enterPassword (String password){
        enterText(registerPasswordId, password);

    }

    public void enterConfirmPassword (String confirmPassword){
        enterText(registerConfirmPasswordId, confirmPassword);

    }

    public void selectGroupFromDropdown(String group){
        selectFromDropdownByVisibleText(registerSelectGroupDropdownId, group);

    }


}
