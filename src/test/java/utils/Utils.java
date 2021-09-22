package utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.Scenario;

public class Utils {

    public static AppiumDriver<MobileElement> driver;

    public static void appInit() {
	try {

	    final DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    final URL url = new URL("http://localhost:4723/wd/hub");

	    desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
	    desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
	    desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5556");
	    desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	    desiredCapabilities.setCapability("appium:appPackage", "com.google.android.deskclock");
	    desiredCapabilities.setCapability("appium:appActivity", "com.android.deskclock.DeskClock");

	    driver = new AppiumDriver<MobileElement>(url, desiredCapabilities);
//	    driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
//	    driver.manage().timeouts().pageLoadTimeout(6000, TimeUnit.MILLISECONDS);
//	    driver.manage().timeouts().setScriptTimeout(10000, TimeUnit.MILLISECONDS);

	} catch (MalformedURLException mue) {

	    System.err.println(mue.getMessage());
	    mue.printStackTrace();
	}
    }

    public static void appClose() {
	    driver.quit();
    }

    public static void takeScreenShot(AndroidDriver<MobileElement> driver, Scenario scenario) {

	byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

	scenario.attach(screenShot, "image/png", "Cucumber screenshot");
    }

}
