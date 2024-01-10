/*
 * page objects for Admin page
 * @author Pavan Vijayrao
 */

package test.pageObjects;

import org.openqa.selenium.By;

public class AdminPage {
    public static By addUserButton = By.cssSelector(".orangehrm-header-container button");
    public static By employeeName = By.cssSelector(".oxd-form-row:nth-child(1) .oxd-grid-item:nth-child(2) input");
    public static By statusDropdown = By.cssSelector("div.oxd-form-row:nth-child(1) .oxd-grid-item:nth-child(3) .oxd-select-text-input");
    public static By userEnabledStatus = By.cssSelector("div.oxd-select-dropdown.--positon-bottom div.oxd-select-option:nth-child(2) span");
    public static By userRoleDropdown = By.cssSelector("div.oxd-form-row:nth-child(1) .oxd-grid-item:nth-child(1) .oxd-select-text-input");
    public static By password = By.cssSelector(".oxd-form-row:nth-child(2) .oxd-grid-item:nth-child(1) input");
    public static By confirmPassword = By.cssSelector(".oxd-form-row:nth-child(2) .oxd-grid-item:nth-child(2) input");
    public static By submitButton = By.cssSelector("button[type=submit]");
    public static By cancelButton = By.cssSelector(".oxd-form-actions button[type='button']");
    public static By employeeNameDropdown = By.cssSelector("div.oxd-autocomplete-dropdown.--positon-bottom div span");
    public static By userAdminRole = By.cssSelector("div.oxd-select-dropdown.--positon-bottom div.oxd-select-option:nth-child(2) span");
    public static By usernameTextbox = By.cssSelector(".oxd-form-row:nth-child(1) .oxd-grid-item:nth-child(4) input");
    public static By usernameSearchBox = By.cssSelector("div.oxd-form-row div.oxd-input-group input.oxd-input");
    public static By firstRowSearchResult = By.cssSelector("div.oxd-table div.oxd-table-body div.oxd-table-card:nth-child(1) div.oxd-table-cell:nth-child(2) div");
}
