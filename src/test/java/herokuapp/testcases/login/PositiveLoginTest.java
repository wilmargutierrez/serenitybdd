package herokuapp.testcases.login;

import herokuapp.steps.LoginSteps;
import herokuapp.steps.SecureAreaSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class PositiveLoginTest {

    @Steps
    private LoginSteps loginSteps;
    @Steps
    private SecureAreaSteps secureAreaSteps;

    @Managed
    private WebDriver webDriver;

    @Test
    @Title("User Tom should be able to log in with valid credentials")
    public void shouldBeAbleToLoginAsTom() {
        loginSteps.isOnTheHomePage();
        loginSteps.logsInAsTom();
        secureAreaSteps.logsOutOfSecureArea();
    }
}
