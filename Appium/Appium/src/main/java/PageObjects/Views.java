package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Views {
	public Views(AndroidDriver<AndroidElement> driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator (driver), this); 
		
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Drag and Drop']")
	public WebElement DraggingDropping;
	@AndroidFindBy(xpath="//android.widget.TextView[@index='8']")
	public WebElement Expnd;
	@AndroidFindBy(xpath="//android.widget.TextView[@index='2']")
	public WebElement Btns;
	@AndroidFindBy(uiAutomator="text(\"Tabs\")")
	public WebElement Tab;
}   
