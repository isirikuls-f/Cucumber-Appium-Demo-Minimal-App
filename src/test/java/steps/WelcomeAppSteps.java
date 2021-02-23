package steps;
import org.openqa.selenium.By;

import helper.AppiumHelper;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class WelcomeAppSteps {
	
    private AppiumDriver appiumDriver;
	private AppiumHelper appiumHelper;
    private String rootPath = "com.avjindersinghsekhon.minimaltodo:id";
	
    @Given("User launch Minimal app.")
    public void user_launch_minimal_app() throws Throwable {
        appiumHelper = new AppiumHelper();
        appiumHelper.Connect();
        appiumDriver = appiumHelper.getDriver();
    }
    
    @When("The App is open.")
    public void the_app_is_open() {
        appiumDriver.findElement(By.id(rootPath + "/toolbar")).isEnabled();
    }
    
    @And("User tap on more options in the right corner of the app.")
    public void user_tap_on_more_icon() {
    	appiumDriver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]")).click();
    }

    @And("User select \"About\" on more options.")
    public void user_select_about() {
    	appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView")).click();
    }
    
    @And("User select \"Settings\" on more options.")
    public void user_select_settingst() {
    	appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView")).click();
    }

    @Then("User see App Name at Title bar.")
    public void user_see_app_name_at_title_bar() {
        appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Minimal')]")).isDisplayed();      
    }
    
    @Then("User see app version on about page correctly.")
    public void user_see_app_version() {
    	appiumDriver.findElement(By.id(rootPath + "/aboutVersionTextView")).isDisplayed();   
    }
    
    @Then("User see settings page correctly.")
    public void user_see_settings_page() {
    	appiumDriver.findElement(By.id("android:id/checkbox")).isDisplayed();   
    }
    
}
