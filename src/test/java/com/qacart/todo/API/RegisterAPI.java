package com.qacart.todo.API;

import com.qacart.todo.UTILES.UsrUtlies;
import com.qacart.todo.objects.User;
import io.restassured.http.Cookie;
import io.restassured.response.Response;
import java.util.List;

import static io.restassured.RestAssured.given;

public class RegisterAPI {
    private  static String accesstoken;
    private static List<Cookie> restAssuredCookies;
    private static String UserId;
    private static String firstname;
          public String getfirstname(){
          return this.firstname;
    }
          public String getUserid(){
            return this.UserId;
        }

          public String gettoken(){
        return this.accesstoken;
    }
          public List<Cookie> getCookies(){
        return this.restAssuredCookies;
    }
          public void Register() {
      User user=UsrUtlies.GeneratRandomUser();

        Response response = given()
                .baseUri("https://qacart-todo.herokuapp.com")
                .header("Content-Type", "application/json")
                .body(user)
                .log().all()
                .when()
                .post("/api/v1/users/register")
                .then()
                .log().all()
                .extract()
                .response();
        if (response.statusCode() != 201) {
           throw  new RuntimeException("il  ya un defaut");
        }
        restAssuredCookies = response.detailedCookies().asList();
        accesstoken = response.path("access_token");
        UserId=response.path("userID");
        firstname=response.path("firstName");

    }
}