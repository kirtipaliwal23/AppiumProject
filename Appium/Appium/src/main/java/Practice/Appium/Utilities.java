package Practice.Appium;


import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import org.openqa.selenium.WebElement;

import PageObjects.HomePage;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Utilities {
	AndroidDriver<AndroidElement> driver;
	
public Utilities(AndroidDriver<AndroidElement> driver) {
		
		this.driver=driver; 
}
public void clickview(){
	HomePage h=new HomePage(driver);
	h.Views.click();

	}
public void dragdrop(WebElement S,WebElement D){
	TouchAction t = new TouchAction(driver);
 	t.longPress(longPressOptions().withElement(element(S))).moveTo(element(D)).release().perform();
}
	public void scrollTotext(String text){
		
	driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));");
	   
	}

}
