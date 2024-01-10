/*
 * HRM Tests
 * @author Pavan Vijayrao
 */

package test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import test.pageActions.AdminActions;
import test.pageActions.HomePageActions;
import test.pageActions.PIMActions;

import static test.utils.TestUtils.*;

public class HRMTest extends BaseTest {

    HomePageActions homePageActions;
    AdminActions adminActions;
    PIMActions pimActions;
    private final static Logger LOGGER = LoggerFactory.getLogger(HRMTest.class);

    @BeforeClass
    public void setUp() {
        setupDriver();
        homePageActions = new HomePageActions(driver);
        adminActions = new AdminActions(driver);
        pimActions = new PIMActions(driver);
        homePageActions.login("Admin", "admin123");
        LOGGER.info("------------Running UI Tests------------");
    }

    @Test
    public void testAddUser() {
        homePageActions.clickOnPIMMenu();
        pimActions.addEmployee("Indiana", "Jones");
        homePageActions.clickOnAdminMenu();
        String userName = getRandomString(8);
        adminActions.addUsers("Indiana Jones", userName, "Test1234");
        adminActions.searchAdminUser(userName);
        String adminFromSearch = adminActions.getAdminFromResults();
        Assert.assertEquals(adminFromSearch, userName);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
