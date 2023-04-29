package com.qacart.todo.testcases;

import com.qacart.todo.API.RegisterAPI;
import com.qacart.todo.UTILES.ConfigUtl;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;

public class Dummy {
    public static void main(String[] args) throws IOException, InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get(ConfigUtl.Getinstance().Geturll());
        driver.manage().window().maximize();
        RegisterAPI rgstrap=new RegisterAPI();
        rgstrap.Register();
        List<io.restassured.http.Cookie> lstcookies= rgstrap.getCookies();
        for (io.restassured.http.Cookie cookie: lstcookies){
            Cookie Seleniumcooki= new Cookie(cookie.getName(),cookie.getValue());
            driver.manage().addCookie(Seleniumcooki);
        }

        driver.get(ConfigUtl.Getinstance().Geturll());
        Thread.sleep(10000);
        driver.quit();
    }
}
