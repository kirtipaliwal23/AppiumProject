package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DragnDrop {
	public DragnDrop(AndroidDriver<AndroidElement> driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	@AndroidFindBy(xpath="//android.view.View[@index='1']")
	public WebElement Source;
	@AndroidFindBy(xpath="//android.view.View[@index='4']")
	public WebElement Dest;
	
}
