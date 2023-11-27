package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assesment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		Thread.sleep(1000);
		
		driver.findElement(By.className("form-control")).sendKeys("hema");
		driver.findElement(By.xpath("(//div[@class='form-group'])[2]/input")).sendKeys("hema@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();
		//List<WebEement> options=driver.findElements(By.id("exampleFormControlSelect1"));
		//Select options=new select(WebElement);
		WebElement staticdropdown=driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown=new Select(staticdropdown);
		dropdown.selectByIndex(1);
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("13-06-1997");
		driver.findElement(By.className("btn-success")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.className("alert")).getText());
		
		
		
		
	}

}
