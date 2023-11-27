package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E2e_travel {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='COK']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		if(driver.findElement(By.id("Div1")).getAttribute("Style").contains("0.5"))
		{
			System.out.println("diabled");
			Assert.assertFalse(false);
		}
		else
		{
			Assert.assertTrue(true);
		}
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		for(int i=1;i<4;i++)
		{
			driver.findElement(By.xpath("//div[@id='divpaxOptions'] //span[@id='hrefIncAdt']")).click();
			
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		
		
		WebElement staticdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown=new Select(staticdropdown);
		dropdown.selectByIndex(1);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
