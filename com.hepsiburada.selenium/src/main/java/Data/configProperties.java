package Data;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class configProperties {
    public static Properties property;
    private static String configpath ="Config/config.properties";

    public static void initializePropertyFile() {
        property = new Properties();
        try {
            InputStream instm = new FileInputStream(configpath);
            property.load(instm);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
