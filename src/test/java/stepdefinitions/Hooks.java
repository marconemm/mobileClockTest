package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.Utils;

public class Hooks {

    @Before
    public void setUp() {
	System.out.println("Opening the app...");
	Utils.appInit();
	System.out.println("The app is open.\n");
    }

    @After
    public void tearDown() {
	System.out.println("\nClosing the app...");
	Utils.appClose();
	System.out.println("The app was closed.");
    }

}
