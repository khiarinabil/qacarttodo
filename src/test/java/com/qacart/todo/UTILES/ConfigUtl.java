package com.qacart.todo.UTILES;

import java.io.IOException;
import java.util.Properties;


public  class ConfigUtl {
    private   static    Properties proper ;
    private static    ConfigUtl conf;
private   ConfigUtl() throws IOException {
   proper=PropertiesUtl.loadpro("C:\\Users\\Acer\\IdeaProjects\\CaApplicationProject\\src\\test\\java\\com\\qacart\\todo\\Config\\production.properties");
}
public static ConfigUtl Getinstance() throws IOException {
    if (conf== null) {
       conf= new ConfigUtl();
    }
    return conf;
}
public  String Geturll()
{
 String ca=  proper.getProperty("baseUrl");

return ca;
}

    public String  GetEmail() {
       String ba=  proper.getProperty("email");

return ba;
    }

    public String  GetPassword() {

  String   na=proper.getProperty("password");

return na;
    }

}

