package com.qacart.todo.UTILES;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class PropertiesUtl {
    public static Properties loadpro(String filepath) throws IOException {
        File file = new File(filepath);
            InputStream inps = new FileInputStream(file);
            Properties props = new Properties();
            props.load(inps);
            inps.close();
            return props;
        }
        }





