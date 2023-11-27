package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Selintroduction {

	public static void main(String[] args) throws InterruptedException {
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(5000);
		driver.close();
		
		

	}

}
