
package reuseablePackage.reuseFunction;
import reuseablePackage.feature.AllActions;
import org.openqa.selenium.WebDriver;
public class new1Class{
	
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	public new1Class(ThreadLocal<WebDriver> driver) {

		this.driver=driver;
	}
	AllActions actions = new AllActions();
String a;
public String new1() throws Exception
{
actions.Refresh();
return a;







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

// public class new1Class extends  AllActions {
// 	public static WebDriver driver;
	
// 	AllActions actionObject = new AllActions();
	
// 	}  
// }