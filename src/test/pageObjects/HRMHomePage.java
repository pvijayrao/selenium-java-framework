/*
 * page objects for HRM home page
 * @author Pavan Vijayrao
 */

package test.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HRMHomePage {

    public WebDriver driver;

    public HRMHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public static By username = By.cssSelector("input[name=username]");
    public static By pwd = By.cssSelector("input[name=password]");
    public static By submit = By.cssSelector("button[type=submit]");
    public static By timesheet = By.cssSelector("ul.oxd-main-menu li:nth-child(4) span");
    public static By adminMenu = By.cssSelector("ul.oxd-main-menu li:nth-child(1) span:nth-child(2)");
    public static By pimMenu = By.cssSelector("ul.oxd-main-menu li:nth-child(2) span");
    public static By firstName = By.cssSelector("input[name=firstName]");
    public static By lastName = By.cssSelector("input[name=lastName]");
    public static By saveButton = By.cssSelector("button[type=submit]");
}
