package utils;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
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
	    driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

	} catch (MalformedURLException mue) {

	    System.err.println(mue.getMessage());
	    mue.printStackTrace();
	}
    }

    public static void appClose() {
	driver.quit();
    }

    public static void takeScreenShot(Scenario scenario) {
	try {

	    final byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

	    scenario.attach(screenShot, "image/png", "Cucumber screenshot");

	    final File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    final File srcTo = new File("./target/screenshots",
		    scenario.getName() + " - " + scenario.getStatus() + ".png");

	    FileUtils.copyFile(file, srcTo);
	    
	} catch (IOException ioe) {
	    System.err.println(ioe.getMessage());
	    System.err.println(ioe.getCause());
	    ioe.printStackTrace();
	}
    }
    
    public static void wait(int miliseconds) {
	try {
	    System.out.println("\nWaiting...");
	    Thread.sleep(miliseconds);
	} catch (InterruptedException ie) {
	    System.err.println(ie.getMessage());
	    System.err.println(ie.getCause());
	    ie.printStackTrace();
	}
	
    }

}
