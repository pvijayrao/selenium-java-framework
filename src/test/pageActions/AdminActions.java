package test.pageActions;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import test.utils.TestUtils;

import static test.pageObjects.AdminPage.*;
import static test.utils.TestUtils.*;

public class AdminActions {

    WebDriver driver;
    private final static Logger LOGGER = LoggerFactory.getLogger(AdminActions.class);

    public AdminActions(WebDriver driver) {
        this.driver = driver;
    }

    public void addUsers(String employeeName, String username, String password) {
        clickOnAdUser();
        selectEmployeeFromDropdown(employeeName);
        selectAdminRoleFromDropdown();
        selectEnabledStatusFromDropdown();
        enterUserName(username);
        enterPassword(password);
        confirmPassword(password);
        clickOnSaveUser();
        waitForSeconds(5);
        LOGGER.info("User created:" + username);
    }

    public void enterUserName(String username) {
        driver.findElement(usernameTextbox).sendKeys(username);
    }

    public void enterPassword(String pwd) {
        driver.findElement(password).sendKeys(pwd);
    }

    public void confirmPassword(String pwd) {
        driver.findElement(confirmPassword).sendKeys(pwd);
    }

    public void searchAdminUser(String username) {
        driver.findElement(usernameSearchBox).sendKeys(username);
        driver.findElement(submitButton).click();
        waitForSeconds(2);
    }
    public String getAdminFromResults() {
        return driver.findElement(firstRowSearchResult).getText();
    }

    public void clickOnAdUser() {
        driver.findElement(addUserButton).click();
    }

    public void clickOnSaveUser() {
        driver.findElement(submitButton).click();
    }

    public void selectEnabledStatusFromDropdown() {
        driver.findElement(statusDropdown).click();
        waitForSeconds(2);
        driver.findElement(userEnabledStatus).click();
    }

    public void selectAdminRoleFromDropdown() {
        driver.findElement(userRoleDropdown).click();
        waitForSeconds(2);
        driver.findElement(userAdminRole).click();
    }

    public void selectEmployeeFromDropdown(String empName) {
        driver.findElement(employeeName).sendKeys(empName);
        waitForSeconds(2);
        driver.findElement(employeeNameDropdown).click();
    }
}
