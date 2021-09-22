package screenobjects;

import static utils.Utils.driver;

import io.appium.java_client.MobileElement;

public abstract class BasicClockScreen {
    
//    public BasicClockScreen() {
//	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
//    }
    
//    @AndroidFindBy(xpath = "//android.widget.TextView[@text='ALARM']")
    private MobileElement btnAlarm = driver.findElementByXPath("//android.widget.TextView[@text='ALARM']");
    
//    @AndroidFindBy(xpath = "//android.widget.TextView[@text='STOPWATCH']")
    private MobileElement btnStopWatch = driver.findElementByXPath("//android.widget.TextView[@text='STOPWATCH']");
    

    public void clickOnBtnAlarm() {

	btnAlarm.click();
    }
    
    
    public void clickOnBtnStopWatch() {

	btnStopWatch.click();
    }
    

}
