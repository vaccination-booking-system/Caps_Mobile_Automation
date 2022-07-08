package com.example.app.drivers;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidDriverInit {
    public static AndroidDriver<AndroidElement> driver;

    public static void intialize(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("platVersion", "11");
        caps.setCapability("automationName", "UIAutomator2");
        caps.setCapability("app","C:\\Users\\ponda\\Documents\\Caps_Mobile_Automation\\sample-mobile-automation\\src\\test\\resources\\application\\Evizy-debug3.apk");

        try{
            driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
        } catch (MalformedURLException e){
            e.printStackTrace();
        }

    }

    public static void quit(){
        driver.quit();

    }


}
