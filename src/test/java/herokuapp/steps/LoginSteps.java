package herokuapp.steps;

import herokuapp.pages.LoginPage;
import herokuapp.pages.SecureAreaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.junit.Assert.assertTrue;

public class LoginSteps extends ScenarioSteps {
    private LoginPage loginPage;
    private SecureAreaPage secureAreaPage;

    @Step
    public void isOnTheHomePage() {
        loginPage.open();
    }

    @Step("User logs in as Tom")
    public void logsInAsTom() {
        loginPage.loginAsTom();
        assertTrue("Tom does not seem to be in the secure area",
                secureAreaPage.getHeaderSecureArea().contentEquals("Secure Area"));
    }
}
