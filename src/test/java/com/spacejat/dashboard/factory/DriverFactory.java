package com.spacejat.dashboard.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class DriverFactory {
    protected WebDriver driver;

    public WebDriver initializeDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("use-fake-ui-for-media-stream");
        String browser = System.getProperty("browser","CHROME");
        switch (browser)
        {
            case "CHROME":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(options);
                break;
            case "FIREFOX":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "EDGE":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            case "SAFARI":
                driver = new SafariDriver();
                break;
            default:
                throw new RuntimeException("The browser is not supported");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(80));
        return driver;
    }
}
