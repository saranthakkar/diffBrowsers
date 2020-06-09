package org.example.BaseClassPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public static WebDriver driver;

    public DriverFactory() {
        PageFactory.initElements(driver, this);
    }
    public void openBrower() {
        //--------------Firefox by setProperty and Path--------------------
        //System.setProperty("webdriver.gecko.driver","D:\\Desktop\\Geckodriver\\geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();

        //---------------Firefox by WebDriverManager-----------------------
        //WebDriverManager.firefoxdriver().setup();
        //driver = new FirefoxDriver();

        //-----------Internet Explorer by setProperty and Path----------------
        //System.setProperty("webdriver.ie.driver","D:\\Desktop\\IEdriver\\IEDriverServer.exe");
        //WebDriver driver = new InternetExplorerDriver();

        //----------Internet Explorer by WebDriverManager-----------------------
        //WebDriverManager.iedriver().setup();
        //driver =new InternetExplorerDriver();

        //-------------Google Chrome by setProperty and path---------------------
        //System.setProperty("webdriver.chrome.driver","D:\\Desktop\\chromedriver_win32\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();

        //-------------Google Chrome by WebDriverManager--------------------
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        driver.get("https://learn.letskodeit.com/p/practice");
        driver.manage().window().maximize();

    }

    public void closeBrowser() throws InterruptedException {
        //Thread.sleep(2000);
        //driver.quit();
    }
}
