package test.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import test.BaseTest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class TestUtils {

    private final static Logger LOGGER = LoggerFactory.getLogger(TestUtils.class);

    public static String getRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(random.nextInt(chars
                    .length())));
        }
        return sb.toString();
    }

    public static void waitForSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void takeScreenshot(ITestResult result) {
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        TakesScreenshot scrShot = ((TakesScreenshot) BaseTest.driver);
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
        try {
            File destFile = new File("./src/test/resources/screenshots/" +
                    result.getName() + "_" + date + "_" + new Date().getTime() + ".jpg");
            FileUtils.copyFile(srcFile, destFile);
            LOGGER.info("------------Screenshot filename: " + destFile);
        } catch (IOException e) {
            LOGGER.error("Failed to generate screenshot.....error:" + e.getMessage());
            e.printStackTrace();
        }
    }
}
