package tests.İhsan;

import org.testng.annotations.Test;
import pages.user.UserSignIn;
import pages.visitor.VisitorHomePage;
import utilities.Driver;

public class US10 {
    VisitorHomePage visitorHomePage = new VisitorHomePage();
    UserSignIn userSignIn = new UserSignIn();
    @Test
    public void testCase01(){
        // 1- User go to the "https://qa.easybusticket.com"
        Driver.getDriver().get("userUrl");

        // 2- User clicks on "Sign In" button.
        visitorHomePage.singInButton.click();

        // 3- User displays the "Sign In" page.


        // 4- User clicks on "Username" box.
        userSignIn.usernameBox.click();

        // 5- User enters a valid username.
        

        // 6- User clicks on "Password" box.


        // 7- User enters a valid password.


        // 8- User clicks the "Login" button.


        // 9- User displays the "Dashboard" page.


    }

    @Test
    public void testCase02(){
        // 1- User go to the "https://qa.easybusticket.com"
        // 2- User clicks on "Sign In" button.
        // 3- User displays the "Sign In" page
        // 4- User clicks on "Username" box.
        // 5- User enters an invalid username.
        // 6- User clicks on "Password" box.
        // 7- User enters a valid password.
        // 8- User clicks the "Login" button.
        // 9- User verifies that "These credentials do not match our records." error text appeared.
    }

    @Test
    public void testCase03(){
        // 1- User go to the "https://qa.easybusticket.com"
        // 2- User clicks on "Sign In" button.
        // 3- User displays the "Sign In" page
        // 4- User clicks on "Username" box.
        // 5- User enters a valid username.
        // 6- User clicks on "Password" box.
        // 7- User enters a invalid password.
        // 8- User clicks the "Login" button.
        // 9- User verifies that "These credentials do not match our records." error text appeared.
    }

    @Test
    public void testCase04(){
        // 1- User go to the "https://qa.easybusticket.com"
        // 2- User clicks on "Sign In" button.
        // 3- User displays the "Sign In" page
        // 4- User clicks on "Username" box.
        // 5- User enters a imvalid username.
        // 6- User clicks on "Password" box.
        // 7- User enters a invalid password.
        // 8- User clicks the "Login" button.
        // 9- User verifies that "These credentials do not match our records." error text appeared.
    }
}
