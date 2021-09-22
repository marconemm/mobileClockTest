package screenobjects;

import static utils.Utils.driver;

import io.appium.java_client.MobileElement;

public abstract class BasicClockScreen {

//    public BasicClockScreen() {
//	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
//    }

//    @AndroidFindBy(xpath = "//android.widget.TextView[@text='ALARM']")
    private MobileElement btnAlarm;

//    @AndroidFindBy(xpath = "//android.widget.TextView[@text='STOPWATCH']")
    private MobileElement btnStopWatch;

    public BasicClockScreen() {
	btnAlarm = null;
	btnStopWatch = null;
    }

    public void clickOnBtnAlarm() {
	if (btnAlarm == null) {
	    btnAlarm = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='ALARM']");
	}

	btnAlarm.click();
    }

    public void clickOnBtnStopWatch() {
	if (btnStopWatch == null) {
	    btnStopWatch = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='STOPWATCH']");
	}

	btnStopWatch.click();
    }

}
