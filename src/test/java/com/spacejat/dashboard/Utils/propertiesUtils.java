package com.spacejat.dashboard.Utils;

import java.io.*;
import java.util.Properties;

public class propertiesUtils {
    public static Properties loadProUtils(String filePath){
        File file = new File(filePath);
        try {
            InputStream inputStream = new FileInputStream(file);
            Properties properties = new Properties();
            properties.load(inputStream);
            inputStream.close();
            return properties;

        } catch (FileNotFoundException e) {
            throw new RuntimeException("File is not Found");
        } catch (IOException e) {
            throw new RuntimeException("Error While Loading the properties");
        }

    }
}
