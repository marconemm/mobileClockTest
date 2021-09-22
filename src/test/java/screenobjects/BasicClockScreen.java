package screenobjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import utils.Utils;

public abstract class BasicClockScreen {

    static AndroidDriver<MobileElement> driver;

//    public BasicClockScreen(AndroidDriver<MobileElement> driver) {
//	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
//    }
//
//    @AndroidFindBy(xpath = "//android.widget.TextView[@text='ALARM']")
//    private MobileElement btnAlarm;

    public void clickOnBtnAlarm() {
	MobileElement btnAlarm = driver.findElementByXPath("//android.widget.TextView[@text='ALARM']");

	btnAlarm.click();
    }

    public static void initApp() {
	driver = Utils.appInit();
    }

    public static void closeApp() {

	Utils.appClose(driver);

    }
}
