package pages.user.visitor;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VisitorContact {
    public VisitorContact(){
        PageFactory.initElements(Driver.getDriver(),this);}
}
