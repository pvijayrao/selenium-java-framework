package test.pageActions;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static test.pageObjects.PimPage.*;

public class PIMActions {

    WebDriver driver;
    private final static Logger LOGGER = LoggerFactory.getLogger(PIMActions.class);

    public PIMActions(WebDriver driver) {
        this.driver = driver;
    }

    public void addEmployee(String name, String password) {
        clickOnAdEmployee();
        enterFirstname(name);
        enterLastname(password);
        clickSave();
        LOGGER.info("Employee created...");
    }

    public void clickOnAdEmployee() {
        driver.findElement(addUserButton).click();
    }

    public void enterFirstname(String fName) {
        driver.findElement(firstName).sendKeys(fName);
    }

    public void enterLastname(String lName) {
        driver.findElement(lastName).sendKeys(lName);
    }

    public void clickSave() {
        driver.findElement(saveButton).click();
    }
}
