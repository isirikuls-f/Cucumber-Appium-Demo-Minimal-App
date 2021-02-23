package steps;

import org.openqa.selenium.By;

import helper.AppiumHelper;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateReminderSteps {

	private AppiumHelper appiumHelper;
    private AppiumDriver appiumDriver;
    private String rootPath = "com.avjindersinghsekhon.minimaltodo:id";

    @Given("User launch the app.")
    public void user_launch_the_app() throws Throwable {
        appiumHelper = new AppiumHelper();
        appiumHelper.Connect();
        appiumDriver = appiumHelper.getDriver();
    }
    
    @And("User is on Landing page.")
    public void user_is_on_landing_page() {
        appiumDriver.findElement(By.id(rootPath + "/toolbar")).isEnabled();
    }
    
    @When("User tap on new reminder icon.")
    public void user_tap_on_add_new_reminder_icon() {
        appiumDriver.findElement(By.id(rootPath + "/addToDoItemFAB")).click();
    }
    
    @And("User fill reminder name.")
    public void user_fill_reminder_name() {
        appiumDriver.findElement(By.id(rootPath + "/userToDoEditText")).sendKeys("Remind Me");
    }
    
    @And("User tap on save icon.")
    public void user_tap_on_save_icon() {
        appiumDriver.findElement(By.id(rootPath + "/makeToDoFloatingActionButton")).click();
    }
    
    @Then("User see new reminder added on Landing page correctly.")
    public void user_see_new_reminder_created() {
        appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Remind Me')]")).isDisplayed();      
    }
    
    @And("User turn on toggle to set alarm.")
    public void user_turn_on_toggle() {
        appiumDriver.findElement(By.id(rootPath + "/toDoHasDateSwitchCompat")).click();
    }
    
    @And("User see Date-Time alarm correctly.")
    public void user_see_datetime() {
        appiumDriver.findElement(By.id(rootPath + "/todoListItemTimeTextView")).isDisplayed();      
    }
    
}


