package Practice.Appium;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import PageObjects.Buttons;
import PageObjects.Content;
import PageObjects.DragnDrop;
import PageObjects.Expandlist;
import PageObjects.HomePage;
import PageObjects.Tabs;
import PageObjects.Views;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class APIDemo extends base{
		
	@Test(priority=0)
	public void Firstflow() throws IOException {
		AppiumDriverLocalService service = startServer();
		AndroidDriver<AndroidElement>driver=Capabilities("apidemo");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HomePage h=new HomePage(driver);
		assert h.Name.getText().equals(Constants.AppicationName);
		Utilities U=new Utilities(driver);
		U.clickview();
		Views V=new Views(driver);
     	V.DraggingDropping.click();
     	DragnDrop D= new DragnDrop(driver);
     	U.dragdrop(D.Source,D.Dest);
     	service.stop();
		
	}
	
	@Test(priority=1)
	
	public void Secondflow() throws IOException{
		AppiumDriverLocalService service = startServer();
		AndroidDriver<AndroidElement>driver=Capabilities("apidemo");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Utilities U=new Utilities(driver);
		U.clickview();
		Views V=new Views(driver);
		V.Expnd.click();
		Expandlist E= new Expandlist(driver);
		E.Cus.click();
		E.PplN.click();
		assert E.Top.getText().equals(Constants.Name);
		
	}
//	@Test(priority=2)
//	public void Thirdflow() throws IOException{
//		AppiumDriverLocalService service = startServer();
//		AndroidDriver<AndroidElement>driver=Capabilities("apidemo");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Utilities U=new Utilities(driver);
//		U.clickview();
//		Views V=new Views(driver);
//		V.Btns.click();
//		Buttons B=new Buttons(driver);
//		B.Toggle.click();
//		assert B.Toggle.getText().equals(Constants.Status);	
//	}
//	@Test(priority=3)
//	public void Fourthflow() throws IOException{
//		AppiumDriverLocalService service = startServer();
//		AndroidDriver<AndroidElement>driver=Capabilities("apidemo");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Utilities U=new Utilities(driver);
//		U.clickview();
//		U.scrollTotext("Layout Animation");
//		
//	}
//	@Test(priority=4)
//	public void Fifthflow() throws IOException{
//		AppiumDriverLocalService service = startServer();
//		AndroidDriver<AndroidElement>driver=Capabilities("apidemo");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Utilities U=new Utilities(driver);
//		U.clickview();
//		U.scrollTotext("Tabs");
//		Views V=new Views(driver);
//		V.Tab.click();
//		Tabs T=new Tabs(driver);
//		T.Content.click();
//		Content C = new Content(driver);
//		assert C.Value1.isDisplayed();
//		C.Tab2.click();
//		assert C.Value2.isDisplayed();
//	
//	}
	
}
	
	
		


