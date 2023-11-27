package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		String name="hema";		
		
		System.out.println("hema");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password=getpassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
//		driver.findElement(By.tagName("p")).getText();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
//		driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText();
		Thread.sleep(5000);
		//System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");	
		
		driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText();
		System.out.println(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText(), "Hello "+name+",");
		//driver.findElement(By.className("logout-btn")).click();	
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		Thread.sleep(1000);
	    driver.close();
		

	}
	
	public static String getpassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

		String passwordtext=driver.findElement(By.cssSelector("form p")).getText();
		String[] passwordArray=passwordtext.split("'");
		String password=passwordArray[1].split("'")[0];
		return password;
		
		
	}


}
