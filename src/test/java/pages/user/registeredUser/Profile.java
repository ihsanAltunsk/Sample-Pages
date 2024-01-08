package pages.user.registeredUser;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Profile {
    public Profile(){
        PageFactory.initElements(Driver.getDriver(),this);}
}
