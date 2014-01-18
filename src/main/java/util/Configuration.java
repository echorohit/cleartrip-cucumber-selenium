package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class Configuration {

    private static Properties getConfig(){
        Properties properties = new Properties();
        try{
            properties.load(new FileInputStream("config.properties"));
            return properties;
        }
         catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    public static String getProperty(String property){
        return getConfig().getProperty(property);
    }
}
