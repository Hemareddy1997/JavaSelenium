package seleniumNew;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));//liminting scope for a driver
		//footerdriver acts as a driver only for footer section, like driver element scope is entire web page
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		WebElement column1=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(column1.findElements(By.tagName("a")).size());
		//click on each link to check paeges opening
		for(int i=1;i<column1.findElements(By.tagName("a")).size();i++)
		{
			String Clinkonlink=Keys.chord(Keys.CONTROL,Keys.ENTER);//ctrl+click
			column1.findElements(By.tagName("a")).get(i).sendKeys(Clinkonlink);
			Thread.sleep(5000);
			   
		}
		Set<String>windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();	
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
			
		}

	}

}
