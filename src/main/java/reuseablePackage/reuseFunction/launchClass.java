
package reuseablePackage.reuseFunction;
import reuseablePackage.feature.AllActions;
import org.openqa.selenium.WebDriver;
public class launchClass{
	
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	public launchClass(ThreadLocal<WebDriver> driver) {

		this.driver=driver;
	}
	AllActions actions = new AllActions();
String d;
public String launch(String url, int a, int b) throws Exception
{
actions.EnterApplicationURL("url");







}
}



































// package reuseablePackage.feature;

// import java.util.concurrent.TimeUnit;

// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.chrome.ChromeOptions;
// import java.net.MalformedURLException;

// public class launchClass extends  AllActions {
// 	public static WebDriver driver;
	
// 	AllActions actionObject = new AllActions();
	
// 	}  
// }