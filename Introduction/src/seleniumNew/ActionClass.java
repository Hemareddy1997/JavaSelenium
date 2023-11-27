package seleniumNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver-win32");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		//WebDriver driver=WebDriverManager.chromedriver().create();
		WebDriver driver=new ChromeDriver();
		driver.get("www.amazon.in");
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList"))).build().perform();
		

	}

}
