package co.com.yourcompany.certification.nameproject.util.properties;

import co.com.yourcompany.certification.nameproject.exceptions.TechPropertiesDoesNotLoadException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Techproperties {

    private static Properties prop = null;

    private Techproperties() {
        throw new IllegalStateException();

    }

    public static String getUrlFront() {
        loadProperties();
        return prop.getProperty("UrlFront");

    }

    public static void loadProperties() {
        if (prop == null) {
            prop = new Properties();
            File objclasspathRoot = new File(System.getProperty("user.dir"));
            String strFilePath = objclasspathRoot.getAbsolutePath();

            try {
                prop.load(new FileReader(strFilePath + "/tech.properties"));
            } catch (IOException e) {
                throw new TechPropertiesDoesNotLoadException(e);
            }
        }
    }



}
