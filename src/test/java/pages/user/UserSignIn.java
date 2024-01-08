package pages.user;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserSignIn {
    public UserSignIn(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(id = "username")
    public WebElement usernameBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[@*='checkbox']")
    public WebElement rememberMeCheckbox;

    @FindBy(xpath = "//*[@*='account-button w-100']")
    public WebElement loginButton;
}