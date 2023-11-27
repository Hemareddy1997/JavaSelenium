package seleniumNew2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MaximizeWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//driver.manage().deleteCookieNamed("abcd");
		driver.get("https://www.google.com/");
		
		

	}

}
