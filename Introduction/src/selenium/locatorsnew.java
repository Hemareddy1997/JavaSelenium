package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locatorsnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//driver.findElement(By.id("inputUsername")).sendKeys("inputUsername");
		
		//driver.findElement(By.id("inputUsername")).sendKeys("hema");
		}

}
