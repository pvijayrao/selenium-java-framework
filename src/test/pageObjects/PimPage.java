/*
 * page objects for PIM page
 * @author Pavan Vijayrao
 */

package test.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PimPage {

    public WebDriver driver;

    public PimPage(WebDriver driver) {
        this.driver = driver;
    }
    public static By addUserButton = By.cssSelector(".orangehrm-header-container button");
    public static By firstName = By.cssSelector("input[name=firstName]");
    public static By lastName = By.cssSelector("input[name=lastName]");
    public static By saveButton = By.cssSelector("button[type=submit]");
}
