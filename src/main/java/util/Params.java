package util;

//import java.nio.file.Paths;

import java.nio.file.Paths;
import java.util.Properties;

public class Params {


    public static final String OS = "Android";

    public static final String ANDROID_VERSION = "6.0";
    public static final String ANDROID_DEVICE_NAME = "Nexus6";
    public static final String ANDROID_APP_PACKAGE = "com.hackpundit.www.assignment1";
    public static final String ANDROID_APP_ACTIVITY = "com.hackpundit.www.assignment1.MainActivity";
    public static final String ANDROID_APP_PATH = Paths.get(System.getProperty("user.dir"), "src/main/resources/calculator.apk").toAbsolutePath().toString();


}
