package com.qacart.todo.testcases;

import com.qacart.todo.Base.BaseTest;
import com.qacart.todo.Pages.LoginPage;
import com.qacart.todo.UTILES.ConfigUtl;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest  extends BaseTest {

    @Test(description = "connexion")

    public void VerificationLogine() throws IOException {

        LoginPage loginpage = new LoginPage(GetDriver());
        boolean dispo =
                loginpage
                        .load()
                        .logacces(ConfigUtl.Getinstance().GetEmail(),ConfigUtl.Getinstance().GetPassword())
                        .verifwelcom();
       Assert.assertTrue(dispo);
    }
}