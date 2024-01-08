package pages.visitor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VisitorHomePage {
    public VisitorHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[text()='Every Journey is an Adventure, Every Ticket is a Story']")
    public WebElement HomePageVerify;

    // Homepage / SignIn button element
    @FindBy(xpath = "//*[@*='sign-in']")
    public WebElement singInButton;

    // Homepage --> SignIn/Login button element
    @FindBy(xpath = "//*[@*='account-button w-100']")
    public WebElement loginButton;
}