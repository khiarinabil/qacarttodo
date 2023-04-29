package com.qacart.todo.testcases;

import com.qacart.todo.Base.BaseTest;
import com.qacart.todo.Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.qacart.todo.UTILES.ConfigUtl.Getinstance;

public class TodoTest extends BaseTest {

    @Test
    public void NewTodoItem() throws IOException {
        LoginPage lgp=new LoginPage(GetDriver());
        String actuelResult =
                lgp.load()
                        .logacces(Getinstance().GetEmail(), Getinstance().GetPassword())
                        .adnvitem()
                        .AjouterItem("selenium")
                        .recuperertxt();
        Assert.assertEquals(actuelResult,"selenium");


    }
    @Test
    public void DeletItemTodo() throws IOException {
        LoginPage loginpage = new LoginPage(GetDriver());
        boolean deletitem=
                loginpage.load()
                        .logacces(Getinstance().GetEmail(),Getinstance().GetPassword())
                        .adnvitem().AjouterItem("selenium")
                        .supprimmeitem()
                        .msgsup();
       Assert.assertTrue(deletitem);



    }
}
