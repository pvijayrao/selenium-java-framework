package test.pageActions;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static test.pageObjects.HRMHomePage.*;

public class HomePageActions {

    WebDriver driver;
    private final static Logger LOGGER = LoggerFactory.getLogger(AdminActions.class);

    public HomePageActions(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String name, String password) {
        enterUsername(name);
        enterPassword(password);
        clickSubmit();
    }

    public void clickOnTimesheetMenu() {
        driver.findElement(timesheet).click();
    }
    public void clickOnPIMMenu() {
        driver.findElement(pimMenu).click();
    }
    public void clickOnAdminMenu() {
        driver.findElement(adminMenu).click();
    }

    public void enterUsername(String name) {
        driver.findElement(username).sendKeys(name);
    }

    public void enterPassword(String password) {
        driver.findElement(pwd).sendKeys(password);
    }

    public void clickSubmit() {
        driver.findElement(submit).click();
    }
}
