package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.Utils;

public class Hooks {

    @Before
    public void setUp() {
	System.out.println("Opening the app...");
	Utils.appInit();
	System.out.println("The app is open.\n");
    }

    @After
    public void tearDown(Scenario scenario) {
	System.out.println("\nClosing the app...");
	Utils.takeScreenShot(scenario);
	Utils.appClose();
	System.out.println("The app was closed.");
    }

}
