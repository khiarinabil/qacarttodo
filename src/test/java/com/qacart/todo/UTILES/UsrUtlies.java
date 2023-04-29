package com.qacart.todo.UTILES;

import com.github.javafaker.Faker;
import com.qacart.todo.objects.User;

public class UsrUtlies {
    @SuppressWarnings("UnnecessaryLocalVariable")
    public static User GeneratRandomUser() {
        String firstname = new Faker().name().firstName();
        String lastname = new Faker().name().lastName();
        String emaill = new Faker().internet().emailAddress();
        String password = new Faker().internet().password();
        User usr = new User(firstname, lastname, emaill, password);
    return usr;
    }

}
