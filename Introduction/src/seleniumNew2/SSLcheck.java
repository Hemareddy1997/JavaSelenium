package seleniumNew2;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSLcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		//options.addExtensions("extension plugin add location");
//		Proxy Proxy=new Proxy();
//		Proxy.setHttpProxy("ipaddress:4444");
//		options.setCapability("proxy", Proxy);
//		
//		options.setExperimentalOption("excludeSwitches",
//
//			     Arrays.asList("disable-popup-blocking"));          //block pop up windows
		
		
		options.setAcceptInsecureCerts(true);
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
       
		
		
		

//		Map<String, Object> prefs = new HashMap<String, Object>();           //configure chrome download files
//
//		prefs.put("download.default_directory", "/directory/path");
//
//		options.setExperimentalOption("prefs", prefs);
	}

}
