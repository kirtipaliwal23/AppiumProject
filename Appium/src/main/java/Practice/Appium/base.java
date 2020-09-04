package Practice.Appium;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;


public class base {
	public AppiumDriverLocalService startServer(){
		boolean flag=checkIfServerIsRunnning(4723);
		if(!flag){
			AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();
			service.start();
		}
		
		AppiumDriverLocalService service = null;
		return service;
	}
public static boolean checkIfServerIsRunnning(int port) {
		
		boolean isServerRunning = false;
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(port);
			
			serverSocket.close();
		} catch (IOException e) {
			//If control comes here, then it means that the port is in use
			isServerRunning = true;
		} finally {
			serverSocket = null;
		}
		return isServerRunning;
	}

	public static AndroidDriver<AndroidElement> Capabilities(String appName) throws IOException {
		System.getProperty("user.dir");
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\PageObjects\\global.properties");
		Properties prop= new Properties();
		prop.load(fis);
		File f=new File("src");
		File fs= new File(f,(String) prop.get(appName)); 
		DesiredCapabilities cap=new DesiredCapabilities();
		String device=(String) prop.get("driver");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, device);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
	    cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
	    cap.setCapability("–session-override", true);
	    AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
     	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
		}

}
