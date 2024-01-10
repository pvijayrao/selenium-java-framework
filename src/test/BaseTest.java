package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static WebDriver driver = null;
    private final static Logger LOGGER = LoggerFactory.getLogger(BaseTest.class);

    public void setupDriver() {
        Properties prop = new Properties();
        try {
            prop.load(BaseTest.class.getClassLoader().getResourceAsStream("test.properties"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        String browser = (System.getProperty("browser")) == null ? prop.getProperty("browser") : System.getProperty("browser");
        String url = (System.getProperty("app_url")) == null ? prop.getProperty("app_url") : System.getProperty("app_url");
        String env = (System.getProperty("env")) == null ? prop.getProperty("env") : System.getProperty("env");

        LOGGER.info("-------------Environment:" + env);
        LOGGER.info("-------------Setting up browser:" + browser);

        switch (browser) {
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            default:
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(options);
        }
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
}
