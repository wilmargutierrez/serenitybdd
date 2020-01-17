package herokuapp.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;

import java.util.concurrent.TimeUnit;

import static java.time.temporal.ChronoUnit.MILLIS;

@DefaultUrl("http://the-internet.herokuapp.com/login")
public class LoginPage extends PageObject {

    @FindBy(id = "username")
    private WebElementFacade textFieldUsername;

    @FindBy(id = "password")
    private WebElementFacade textFieldPassword;

    // specific delay for "lazy" page objects
    @FindBy(xpath = "//button[@type='submit']", timeoutInSeconds = "10")
    private WebElementFacade buttonLogin;

    @FindBy(id = "flash")
    private WebElementFacade messageSuccessfulLogout;


    public void loginAsTom() {

        // additional delay for "lazy" page objects
        textFieldUsername.withTimeoutOf(2000, MILLIS).type("tomsmith");
        textFieldPassword.type("SuperSecretPassword!");
        buttonLogin.click();
    }

    public String getMessageSuccessfulLogout() {
        return messageSuccessfulLogout.getAttribute("innerText").trim();
    }
}
