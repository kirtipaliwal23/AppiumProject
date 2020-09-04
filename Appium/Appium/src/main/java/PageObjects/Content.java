package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Content {
public Content(AndroidDriver<AndroidElement> driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator (driver), this); 
		
	}
@AndroidFindBy(uiAutomator="text(\"TAB1\")")
public WebElement Tab1;
@AndroidFindBy(uiAutomator="text(\"TAB2\")")
public WebElement Tab2;
@AndroidFindBy(id="io.appium.android.apis:id/view1")
public WebElement Value1;
@AndroidFindBy(id="io.appium.android.apis:id/view2")
public WebElement Value2;
}