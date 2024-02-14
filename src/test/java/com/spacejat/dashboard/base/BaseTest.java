package com.spacejat.dashboard.base;


import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import com.github.rsheremeta.AllureEnv;
import com.spacejat.dashboard.Utils.ConfigUtils;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import com.spacejat.dashboard.factory.DriverFactory;
import org.testng.annotations.BeforeSuite;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class BaseTest extends DriverFactory {
    protected WebDriver driver;
    protected ATUTestRecorder recorder;

    @BeforeSuite
    public void DeleteVideos(){
        deleteVideos("D:\\project\\SpaceJAT_Test\\ScriptVideos\\Recording");
    }
    @BeforeMethod
    public void SetUp(ITestResult result) throws ATUTestRecorderException {
        driver = new DriverFactory().initializeDriver();
        DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
        Date date = new Date();
        String testCaseName = result.getMethod().getMethodName();
        recorder = new ATUTestRecorder
                ("D:\\project\\SpaceJAT_Test\\ScriptVideos"
                        ,testCaseName + "-"+dateFormat.format(date)
                        ,false);
        recorder.start();
        driver.get("https://www.google.com/");
    }
    @AfterMethod
    public void TearDown(ITestResult result) throws ATUTestRecorderException {
        String testCaseName = result.getMethod().getMethodName();
        File destFile = new File("target" + File.separator + "screenshots" + File.separator + testCaseName + ".png");
        takeScreenshots(destFile);
        driver.quit();
        recorder.stop();
    }
    @AfterSuite(alwaysRun = true)
    public void afterSuite() {
        // Instantiate a map with your needed Environment values
        Map<String, String> envData = new HashMap<>();
        envData.put("Base URL",ConfigUtils.getInstance().getBaseUrl());
        envData.put("User", ConfigUtils.getInstance().StatusUsers());
        envData.put("OS", System.getProperty("os.name"));
  /*
  If your /allure-results is in /target – just pass instantiated map as a parameter
  */
        AllureEnv.createAllureEnvironmentFile(envData);
  /*
  If your /allure-results is in custom directory – just pass one more parameter
  with customPath to your /allure-results directory
  */
        AllureEnv.createAllureEnvironmentFile(envData, "D:\\project\\SpaceJAT_Test\\build\\allure-results");
    }
    public void takeScreenshots(File destFile){
        File file =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file,destFile);
            InputStream is = new FileInputStream(destFile);
            Allure.addAttachment("screenshot",is);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void deleteVideos(String path)
    {
        File directory =new File(path);
        File [] files = directory.listFiles();
        for (File file:files){
            file.delete();
        }
    }

}
