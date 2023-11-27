package seleniumNew2;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class filterElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		//WebDriver driver= new ChromeDriver();
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	  driver.findElement(By.id("search-field")).click();
//	  driver.findElement(By.id("search-field")).sendKeys("Rice");
//	  String name=driver.findElement(By.xpath("//tr/td[1]")).getText();
//	  Assert.assertTrue(name.equals("Rice"));
	  //morethan 1element matches
	  driver.findElement(By.id("search-field")).sendKeys("to");
	 List<WebElement> vegtables= driver.findElements(By.xpath("//tr/td[1]"));
	List<WebElement> sortedveg= vegtables.stream().filter(s->s.getText().contains("to")).collect(Collectors.toList());
	Assert.assertEquals(vegtables.size(), sortedveg.size());
	  
	  

	}

}
