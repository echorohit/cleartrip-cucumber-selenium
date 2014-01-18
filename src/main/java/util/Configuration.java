package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class Configuration {

    public static Properties getConfig(){
        Properties properties = new Properties();
        try{
            properties.load(new FileInputStream("config.properties"));
            return properties;
        }
         catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return properties;
    }
}
