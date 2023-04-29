package com.qacart.todo.Base;

import com.qacart.todo.Factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class BaseTest {
    protected ThreadLocal<WebDriver> driver= new ThreadLocal<>();
     public void SetDriver(WebDriver driver){
         this.driver.set(driver);
     }
     public WebDriver GetDriver(){
         return this.driver.get();
     }
    @BeforeMethod
    public void setup(){
        WebDriver driver= new DriverFactory().InitialserDriver();
        SetDriver(driver);
    }
    @AfterMethod
    public void closedd() throws IOException {
        GetDriver().quit();

    }
}
