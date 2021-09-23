package screenobjects;

import static utils.Utils.driver;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public abstract class BasicClockScreen {

    public BasicClockScreen() {
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='ALARM']")
    private MobileElement btnAlarm;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='STOPWATCH']")
    private MobileElement btnStopWatch;

    public void clickOnBtnAlarm() {
	btnAlarm.click();
    }

    public void clickOnBtnStopWatch() {
	btnStopWatch.click();
    }

}
