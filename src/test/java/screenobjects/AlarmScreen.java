package screenobjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import utils.Utils;

public class AlarmScreen extends BasicClockScreen {

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@resource-id='com.google.android.deskclock:id/fab']")
    private MobileElement addBtn;

//    @AndroidFindBy(id = "android:id/hours")
//    private MobileElement hourLbl;

//    @AndroidFindBy(id = "android:id/minutes")
//    private MobileElement minutesLbl;

    @AndroidFindBy(id = "android:id/button1")
    private MobileElement okBtn;

    @AndroidFindBy(id = "com.google.android.deskclock:id/edit_label")
    private MobileElement alarmLbl;

    public void clickOnAddBtn() {
	addBtn.click();
    }

    public void setTime(String time) {
	final String hour = time.split(":")[0];
	final String minutes = time.split(":")[1];
	final MobileElement toggleBtn = (MobileElement) Utils.driver.findElementById("android:id/toggle_mode");
	toggleBtn.click();
	
	final MobileElement inputHours = (MobileElement) Utils.driver.findElementById("android:id/input_hour");
	inputHours.clear();
	inputHours.sendKeys(hour);
	
	final MobileElement inputMinutes = (MobileElement) Utils.driver.findElementById("android:id/input_minute");
	inputMinutes.clear();
	inputMinutes.sendKeys(minutes);
	
	toggleBtn.click();
    }
    
    public void clickOkBtn() {
	okBtn.click();
    }
    
    public void clickAlarmLbl() {
	alarmLbl.click();
    }

}
