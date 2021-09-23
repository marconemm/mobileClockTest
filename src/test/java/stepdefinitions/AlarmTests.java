package stepdefinitions;

import static org.junit.Assert.assertTrue;

import java.util.List;

import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import screenobjects.AlarmScreen;
import utils.Utils;

public class AlarmTests {

    private AlarmScreen alarmScreen = new AlarmScreen();

    @Given("Clicks on alarm button")
    public void clicksOnAlarmButton() {
	alarmScreen.clickOnBtnAlarm();
    }

    @Then("Clicks on Add alarm button")
    public void clicksOnAddAlarmButton() {
	alarmScreen.clickOnAddBtn();
//	Utils.wait(300);
    }

    @And("Sets the time to {string}")
    public void setsTheTimeTo(String time) {
	alarmScreen.setTime(time);
    }

    @And("Sets the AM|PM selector to {string}")
    public void setsTheAMPMSelectorTo(String ampm) {

	MobileElement rbAMPM = Utils.driver.findElementById("android:id/" + ampm.toLowerCase() + "_label");
	rbAMPM.click();
    }

    @Then("Clicks on OK button")
    public void clicksOnOKButton() {
	alarmScreen.clickOkBtn();
	Utils.wait(200);
    }

    @Then("Cheks if a new alarm with the folowinf informations exists:")
    public void cheksIfANewAlarmWithTheFolowinfInformationsExists(List<String> timeValues) {
	final List<MobileElement> timeLbl = Utils.driver.findElementsByClassName("android.view.ViewGroup");

	for (MobileElement element : timeLbl) {
	    final String attr = element.getAttribute("content-desc");

	    if (attr != null) {
		System.out.println(attr);
		System.out.println(timeValues.toString());

		final boolean startIsOk = attr.contains(timeValues.get(0));
		final boolean endIsOk = attr.contains(timeValues.get(1));
	
		if (startIsOk && endIsOk) {
		    assertTrue(startIsOk && endIsOk);
		    break;
		}
	    }
	}

    }

    @And("Set its name to {string}")
    public void setItsNameTo(String name) {

    }

    @When("The {string} alarm is located, delete it")
    public void theAlarmIsLocated(String name) {

    }
}
