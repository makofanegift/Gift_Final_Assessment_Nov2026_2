package Steps;

import Pages.HomePage;
import Pages.RegistrationPage;
import TestData.UserData;
import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome", "https://ndosisimplifiedautomation.vercel.app/");

    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    RegistrationPage registrationPage = PageFactory.initElements(driver, RegistrationPage.class);

    UserData userData = new UserData();




}
