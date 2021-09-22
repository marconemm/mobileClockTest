package stepdefinitions;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import screenobjects.AlarmScreen;
import screenobjects.BasicClockScreen;

public class AlarmTests {

    AlarmScreen alarmScreen = new AlarmScreen();

    @BeforeClass
    public static void setUp() {
	System.out.println("Opening the app...");
	BasicClockScreen.initApp();
	System.out.println("The app is open.");
    }

    @Test
    public void alarmClick() {

	alarmScreen.clickOnBtnAlarm();

    }

    @AfterClass
    public static void tearDown() {
	System.out.println("Closing the app...");
	BasicClockScreen.closeApp();
	System.out.println("The app was closed.");
    }

}
