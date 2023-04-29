package com.qacart.todo.Pages;

import com.qacart.todo.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Newtodopage extends BasePage {
    public Newtodopage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css ="[data-testid=\"new-todo\"]" )
    WebElement ajouteritem ;
    @FindBy(css ="[data-testid=\"submit-newTask\"]" )
    WebElement botnnv;
    public TodoPage AjouterItem(String slm){
        ajouteritem.sendKeys(slm);
        botnnv.click();
        return new TodoPage(driver);
    }



}

