package seleniumNew2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTablesAss7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/ ");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		driver.findElement(By.id("product"));
		List<WebElement> rows=driver.findElements(By.cssSelector(".table-display tr"));
		//System.out.println(rows);
		
		 //to find no.of rows		
		int i=1;                              
		for( i=1;i<rows.size();i++)
		{
			rows.get(i).getText();			
		}		
		System.out.println(i);
		
		//to find no.of columns		
		List<WebElement> columns=driver.findElements(By.cssSelector(".table-display th"));
		int j=1;
		for( j=1;j<columns.size();j++)              
		{
			rows.get(j).getText();
			
		}		
		System.out.println(j);
		
		//to print 2nd row
		System.out.println(driver.findElement(By.cssSelector(".table-display tr:nth-child(3)")).getText());

	}

}
