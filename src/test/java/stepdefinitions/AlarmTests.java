package stepdefinitions;

import static org.junit.Assert.assertTrue;

import java.util.List;

import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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
    }

    @Then("Sets its time to {string}")
    public void setsItsTimeTo(String time) {
	alarmScreen.setTime(time);
    }

    @Then("Sets its AM|PM selector to {string}")
    public void setsItsAMPMSelectorTo(String ampm) {
	MobileElement rbAMPM = Utils.driver.findElementById("android:id/" + ampm.toLowerCase() + "_label");
	rbAMPM.click();
    }

    @Then("Clicks on OK button")
    public void clicksOnOKButton() {
	alarmScreen.clickOkBtn();
    }

    @Then("Cheks if a new alarm with the folowing informations exists:")
    public void cheksIfANewAlarmWithTheFolowingInformationsExists(List<String> timeValues) {
	final boolean result = alarmScreen.alarmExists(timeValues);

	if (result) {
	    assertTrue(result);
	}
    }

    @And("Set its name to {string}")
    public void setItsNameTo(String name) {
	final List<MobileElement> vgList = Utils.driver.findElementsByClassName("android.widget.TextView");

	for (MobileElement element : vgList) {
	    final String attr = element.getAttribute("text");

	    if (attr.intern() == "Label") {
		element.click();
		final MobileElement inputTxt = Utils.driver.findElementByClassName("android.widget.EditText");
		final MobileElement btnOK = Utils.driver.findElementById("android:id/button1");

		inputTxt.clear();
		inputTxt.sendKeys(name);
		btnOK.click();
		break;
	    }
	}
    }

    @Given("the alarm with the folowing informations exists, delete it:")
    public void theAlarmWithTheFolowingInformationsExistsDeleteIt(List<String> timeValues) {

	final boolean alarmExists = alarmScreen.alarmExists(timeValues);

	if (alarmExists) {
	    final MobileElement btnDelete = Utils.driver.findElementById("com.google.android.deskclock:id/delete");
	    btnDelete.click();
	}

    }
}
