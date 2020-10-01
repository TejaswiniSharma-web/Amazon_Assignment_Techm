package utilities;

import org.testng.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReUsables {


    public static String getValue(String key)  {
        String value = null;
        try {
            FileInputStream fis = new FileInputStream(new File(System.getProperty("user.dir") + File.separator + "config.properties"));
            Properties prop = new Properties();
            prop.load(fis);
            value = prop.getProperty(key);
        }catch (Exception e){
            Assert.fail("Config properties file not found");
        }
        return value;
    }

}
