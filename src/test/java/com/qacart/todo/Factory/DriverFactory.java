package com.qacart.todo.Factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;



public class DriverFactory {

    public WebDriver InitialserDriver() {

        String browser = System.getProperty("browser","CHROME");
        WebDriver driver;
        switch (browser) {
            case "CHROME":
                WebDriverManager.chromedriver().setup();
                 driver = new ChromeDriver();
                break;
            case "FIREFOX":
                WebDriverManager.firefoxdriver().setup();
                driver= new FirefoxDriver();

                break;
            default:
                throw new RuntimeException("ce navigateur ne pas supporter");
        }


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        return driver;


    }
}
