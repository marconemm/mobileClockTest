package stepdefinitions;

import io.cucumber.java.en.Given;
import screenobjects.AlarmScreen;

public class AlarmTests {

    private AlarmScreen alarmScreen = new AlarmScreen();
    
    @Given("Clicks on alarm button")
    public void clicksOnAlarmButton() {
        alarmScreen.clickOnBtnAlarm();
    }


}
