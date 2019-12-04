package herokuapp.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class SecureAreaPage extends PageObject {

    @FindBy(xpath = "//*[@id='content']/div/h2")
    private WebElementFacade headerSecureArea;

    @FindBy(xpath = "//*[@id='content']/div/a")
    private WebElementFacade buttonLogout;

    public String getHeaderSecureArea() {
        return headerSecureArea.getText().trim();
    }

    public void logsOut() {
        buttonLogout.click();
    }
}
