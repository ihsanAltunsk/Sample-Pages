package pages.admin.manageTrips;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Trip {
    public Trip(){
        PageFactory.initElements(Driver.getDriver(),this);}
}
