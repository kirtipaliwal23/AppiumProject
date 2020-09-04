package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Expandlist {
	public Expandlist(AndroidDriver<AndroidElement> driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@text='1. Custom Adapter']")
	public WebElement Cus;
	@AndroidFindBy(uiAutomator="text(\"People Names\")")
	public WebElement PplN;
	@AndroidFindBy(xpath="//android.widget.TextView[@index=1]")
	public WebElement Top;
}
