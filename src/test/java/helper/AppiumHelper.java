package helper;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class AppiumHelper {

    private DesiredCapabilities capabilities;
    private AppiumDriver appiumDriver;
    private URL url;

    public AppiumHelper() throws MalformedURLException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "JAD51926009276");
        capabilities.setCapability("app","D:\\cucumber-workspace\\HelloAppiumMaven\\app\\app-release.apk");
        capabilities.setCapability("platformVersion","8.1.0");
        url = new URL("http://localhost:4723/wd/hub");
    }

    public void Connect(){
    	appiumDriver = new AppiumDriver(url,capabilities);
    	appiumDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    public AppiumDriver getDriver(){
        return appiumDriver;
    }

}
