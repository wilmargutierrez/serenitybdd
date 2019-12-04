package herokuapp.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;

@DefaultUrl("http://the-internet.herokuapp.com/login")
public class LoginPage extends PageObject {

    @FindBy(id = "username")
    private WebElementFacade textFieldUsername;

    @FindBy(id = "password")
    private WebElementFacade textFieldPassword;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElementFacade buttonLogin;

    @FindBy(id = "flash")
    private WebElementFacade messageSuccessfulLogout;


    public void loginAsTom() {
        textFieldUsername.type("tomsmith");
        textFieldPassword.type("SuperSecretPassword!");
        buttonLogin.click();
    }

    public String getMessageSuccessfulLogout() {
        return messageSuccessfulLogout.getAttribute("innerText").trim();
    }
}
