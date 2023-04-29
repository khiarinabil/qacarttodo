package com.qacart.todo.Pages;

import com.qacart.todo.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TodoPage extends BasePage {
    public TodoPage(WebDriver driver) {
        super(driver);

    }
    @FindBy(css = "[data-testid=\"add\"]")
    WebElement addd ;
    @FindBy(css = "[data-testid=\"welcome\"]")
    WebElement welcomm ;


    @FindBy(css ="[data-testid=\"todo-text\"]" )
    WebElement tdtxt;
    @FindBy(css ="[data-testid=\"delete\"]" )
    WebElement supitem;
    @FindBy(css ="[data-testid=\"no-todos\"]" )
    WebElement vrfsup;
     public boolean verifwelcom(){
         return welcomm.isDisplayed();
     }

     public String recuperertxt() {
        return tdtxt.getText();
     }
     public TodoPage supprimmeitem()
     {
         supitem.click();
         return this;
     }
     public boolean msgsup(){
      return    vrfsup.isDisplayed();
     }
     public Newtodopage adnvitem(){
         addd.click();
         return new Newtodopage(driver);
     }
}
