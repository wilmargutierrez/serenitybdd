package herokuapp.steps;

import herokuapp.pages.LoginPage;
import herokuapp.pages.SecureAreaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.junit.Assert.assertTrue;

public class SecureAreaSteps extends ScenarioSteps {
    private SecureAreaPage secureAreaPage;
    private LoginPage loginPage;

    @Step
    public void logsOutOfSecureArea() {
        secureAreaPage.logsOut();
        assertTrue("Tom does not seem to have logged out.",
                loginPage.getMessageSuccessfulLogout().contains("You logged out of the secure area!"));
    }
}
