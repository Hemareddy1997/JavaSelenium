package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownCity {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//destination select		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();---udemy class54
		//driver.findElement(By.xpath("//a[@value='MAA']")).click();
		//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
//select date from calendar current date
	
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		String style=driver.findElement(By.id("Div1")).getAttribute("style");
		if(style.contains("1"))
		{
			System.out.println("enabled");
			Assert.assertTrue(true);
		}
		else
		{
			//Assert.assertFalse(true);
			System.out.println("disabled");
			
		}
		
		
		
	}

}
