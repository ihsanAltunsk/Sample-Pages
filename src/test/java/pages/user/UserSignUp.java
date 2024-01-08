package pages.user;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserSignUp {
    public UserSignUp(){
        PageFactory.initElements(Driver.getDriver(),this);}
}
