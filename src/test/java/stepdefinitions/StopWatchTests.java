package stepdefinitions;

import io.cucumber.java.en.Then;
import screenobjects.StopWatchScreen;

public class StopWatchTests {

    final private StopWatchScreen stopWatchScreen;

    public StopWatchTests() {
	stopWatchScreen = new StopWatchScreen();
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
}
