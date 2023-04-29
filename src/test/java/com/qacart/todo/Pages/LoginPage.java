package com.qacart.todo.Pages;

import com.qacart.todo.Base.BasePage;
import com.qacart.todo.UTILES.ConfigUtl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class LoginPage  extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="email")
    private WebElement emaill;
    @FindBy(id ="password")
    private WebElement passwordd;
    @FindBy(id = "submit")
    private WebElement bouton;


    public LoginPage load() throws IOException {
        driver.get(ConfigUtl.Getinstance().Geturll());
        return this;
    }
    public  TodoPage logacces(String eml, String psrd){
        emaill.sendKeys(eml);
        passwordd.sendKeys(psrd);
        bouton.click();
        return new TodoPage(driver);
    }

}
