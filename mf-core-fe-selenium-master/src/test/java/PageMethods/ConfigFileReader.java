package PageMethods;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
private Properties properties;

private String getproperties(String Environment) {

    String propertyFilePath = null;
    if (Environment.equals("dev")) {
        propertyFilePath = "src//res//dev.properties";
    } else if (Environment.equals("test")) {
        propertyFilePath = "src//res//test.properties";
    }
    return propertyFilePath;
}

public String GetApplicationBaseURL(String Environment) {
    BufferedReader reader;
    try {
        reader = new BufferedReader(new FileReader(getproperties(Environment)));
        properties = new Properties();
        try {
            properties.load(reader);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
        throw new RuntimeException("Config.properties not found at " + getproperties(Environment));
    }
    String url = properties.getProperty("url");
    if (url != null) return url;
    else throw new RuntimeException("url not specified in the Config.properties file.");
}
}