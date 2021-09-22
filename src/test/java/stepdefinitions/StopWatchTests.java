package stepdefinitions;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import screenobjects.StopWatchScreen;

@FixMethodOrder(MethodSorters.JVM)
public class StopWatchTests {

    final private StopWatchScreen stopWatchScreen = new StopWatchScreen();

//    @Given("I clicked on stopwatch button")
//    @Test
    public void iClickedOnStopwatchButton() {
//	waitMiliseconds(3000);
	stopWatchScreen.clickOnBtnStopWatch();
    }

//    @Then("Click on inner circle button")
    @Test
    public void clickOnInnerCircleButton() {
//	waitMiliseconds(50);
	stopWatchScreen.clickOnInnerCircleBtn();
//	waitMiliseconds(50);
	stopWatchScreen.clickOnInnerCircleBtn();
//	waitMiliseconds(50);
	stopWatchScreen.clickOnInnerCircleBtn();
//	waitMiliseconds(50);
    }

//    @And("wait {int} miliseconds")
//    @Test
//    public void waitMiliseconds(int delay) {
//    public void waitMiliseconds() {
//	try {
//	    Thread.sleep(3000);
//	} catch (InterruptedException ie) {
//	    ie.getMessage();
//	    ie.printStackTrace();
//	}
//    }

//    @Then("Click on reset button")
    @Test
    public void clickOnResetButton() {
//	waitMiliseconds(500);
	stopWatchScreen.clickOnResetBtn();
    }
    
//    private void waitMiliseconds(int delay) {
//   	try {
//   	    Thread.sleep(delay);
//   	} catch (InterruptedException ie) {
//   	    ie.getMessage();
//   	    ie.printStackTrace();
//   	}
//       }

}
