package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import screenobjects.StopWatchScreen;
import utils.Utils;

public class StopWatchTests {

    final private StopWatchScreen stopWatchScreen = new StopWatchScreen();

    @Given("Open the app Clock")
    public void openTheAppClock() {
	System.out.println("Opening the app...");
	Utils.appInit();
	System.out.println("The app is open.\n");
    }
    
    @Then("Clicks on stopwatch button")
    public void clicksOnStopwatchButton() {
	stopWatchScreen.clickOnBtnStopWatch();
    }

    @Then("Clicks on inner circle button")
    public void clicksOnInnerCircleButton() {
	stopWatchScreen.clickOnInnerCircleBtn();
    }
    
    @Then("Clicks on lap button")
    public void clicksOnLapButton() {
	stopWatchScreen.clickOnLapBtn();
    }

    @Then("Clicks on reset button")
    public void clicksOnResetButton() {
	stopWatchScreen.clickOnResetBtn();
    }

    @Then("Closes teh app Clock")
    public void closesTehAppClock() {
	System.out.println("\nClosing the app...");
	Utils.appClose();
	System.out.println("The app was closed.");
    }

}
