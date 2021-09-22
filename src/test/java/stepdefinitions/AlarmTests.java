package stepdefinitions;

import io.cucumber.java.en.When;
import screenobjects.AlarmScreen;

public class AlarmTests extends Hooks {

    private AlarmScreen alarmScreen = new AlarmScreen();

//    public AlarmTests() {
//	alarmScreen =  new AlarmScreen();
//    }

//    @BeforeClass
//    public static void setUp() {
//	System.out.println("Opening the app...");
//	Utils.appInit();
//	System.out.println("The app is open.");
//    }

//    @Test
//    public void alarmClick() {
//	alarmScreen.clickOnBtnAlarm();
//    }

    @When("I clicked on alarm button")
    public void iClickedOnAlarmButton() {
	alarmScreen.clickOnBtnAlarm();
    }

//    @AfterClass
//    public static void tearDown() {
//	System.out.println("Closing the app...");
//	Utils.appClose();
//	System.out.println("The app was closed.");
//    }

}
