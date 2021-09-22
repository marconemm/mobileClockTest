package screenobjects;

import static utils.Utils.driver;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class StopWatchScreen extends BasicClockScreen {

    public StopWatchScreen() {
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.view.View[@resource-id='com.google.android.deskclock:id/stopwatch_circle']")
    private MobileElement btnInnerCircle;
    @AndroidFindBy(id = "com.google.android.deskclock:id/left_button")
    private MobileElement btnReset;
    @AndroidFindBy(id = "com.google.android.deskclock:id/right_button")
    private MobileElement btnLap;

    public void clickOnResetBtn() {
	btnReset.click();
    }

    public void clickOnInnerCircleBtn() {
	btnInnerCircle.click();
    }

    public void clickOnLapBtn() {
	btnLap.click();
    }

}
