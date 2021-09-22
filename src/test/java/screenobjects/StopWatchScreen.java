package screenobjects;

import static utils.Utils.driver;

import io.appium.java_client.MobileElement;

public class StopWatchScreen extends BasicClockScreen {

//    public StopWatchScreen() {
//	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
//    }

//    @AndroidFindBy(id = "com.google.android.deskclock:id/left_button")

//    @AndroidFindBy(accessibility = "com.google.android.deskclock:id/stopwatch_circle")

    private MobileElement btnInnerCircle;
    private MobileElement btnReset;
    private MobileElement btnLap;

    public StopWatchScreen() {
	btnInnerCircle = null;
	btnReset = null;
    }

    public void clickOnResetBtn() {
	if (btnReset == null) {
	    btnReset = (MobileElement) driver.findElementById("com.google.android.deskclock:id/left_button");
	}

	btnReset.click();
    }

    public void clickOnInnerCircleBtn() {
	if (btnInnerCircle == null) {
	    btnInnerCircle = (MobileElement) driver.findElementById("com.google.android.deskclock:id/stopwatch_circle");
	}

	btnInnerCircle.click();
    }
    
    public void clickOnLapBtn() {
	if (btnLap == null) {
	    btnLap = (MobileElement) driver.findElementById("com.google.android.deskclock:id/right_button");	    
	}
	
	btnLap.click();
    }

}
