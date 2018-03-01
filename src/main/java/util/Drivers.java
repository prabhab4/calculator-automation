package util;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static util.Params.*;

public class Drivers {


    private static AppiumDriver driver;
    private static String platformVersion;
    private static String os;
    private static String deviceName;
    private static String appPackage;
    private static String appActivity;
    private static String appPath;



    public static void setUp() throws MalformedURLException {

        setDefaults();

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformVersion", platformVersion);
        capabilities.setCapability("platformName", os);
        capabilities.setCapability("avd", deviceName);
        capabilities.setCapability("deviceName", deviceName);
        capabilities.setCapability("appPackage", appPackage);
        capabilities.setCapability("appActivity", appActivity);
        capabilities.setCapability("app", appPath);

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Driver is setUp");
    }

    private static void setDefaults(){
        if(System.getProperty("ANDROID_VERSION") != null){
            platformVersion = System.getProperty("ANDROID_VERSION");
        } else{
            platformVersion = ANDROID_VERSION;
        }

        if(System.getProperty("OS") != null){
            os = System.getProperty("OS");
        } else
            os = OS;

        if(System.getProperty("DEVICE_NAME") != null){
            deviceName = System.getProperty("DEVICE_NAME");
        } else {
            deviceName = ANDROID_DEVICE_NAME;
        }

        if(System.getProperty("APP_PACKAGE") != null){
            appPackage = System.getProperty("APP_PACKAGE");
        } else{
            appPackage = ANDROID_APP_PACKAGE;
        }

        if(System.getProperty("APP_ACTIVITY") != null){
            appActivity = System.getProperty("APP_ACTIVITY");
        } else{
            appActivity = ANDROID_APP_ACTIVITY;
        }

        if(System.getProperty("APP_PATH") != null){
            appPath = System.getProperty("APP_PATH");
        } else{
            appPath = ANDROID_APP_PATH;
        }

    }

    public static void launchApp(){
        driver.launchApp();
    }

    public static void tearDown(){
        driver.closeApp();
        driver.quit();
    }

     public static MobileElement findElementByAccessibilityId(String accessibilityID){
        return (MobileElement) driver.findElementByAccessibilityId(accessibilityID);
     }

     public static MobileElement findElementByName(String name){
         return (MobileElement) driver.findElementByName(name);
     }

     public static MobileElement findElementById(String id){
         return (MobileElement) driver.findElementById(id);
     }

     public static MobileElement findElementByXpath(String xpath){
         return (MobileElement) driver.findElementByXPath(xpath);
     }


    /*
     * Add more Appium functions when needed
     */

}
