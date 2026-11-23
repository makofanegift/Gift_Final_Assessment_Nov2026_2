package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//span[text()='Login']")
    WebElement homePageLoginButton;

    public HomePage(WebDriver driver){
        super(driver);
    }

    public void verifyHomePageIsDisplayed(){
        waitUntilElementIsVisible(homePageLoginButton).isDisplayed();

    }

    public void clickLoginButton(){
        click(homePageLoginButton);

    }

}
