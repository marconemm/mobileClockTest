package stepdefinitions;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import utils.Utils;

public class Hooks {

    @BeforeClass
    public static void setUp() {
	System.out.println("Opening the app...");
	Utils.appInit();
	System.out.println("The app is open.");
    }

    @AfterClass
    public static void tearDown() {
	System.out.println("Closing the app...");
	Utils.appClose();
	System.out.println("The app was closed.");
    }

}
