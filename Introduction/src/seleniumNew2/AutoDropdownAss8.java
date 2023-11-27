package seleniumNew2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoDropdownAss8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/ ");
		//driver.findElement(By.id("autocomplete")).sendKeys("can");
		
		

		    driver.findElement(By.id("autocomplete")).sendKeys("ind");

		    Thread.sleep(2000);

		    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

		    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

		   System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 	 
		   
		   


		}		


	}


