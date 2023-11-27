package seleniumNew2;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webTableSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
				
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.cssSelector("tr th:nth-child(1)")).click();
		
		List<WebElement> names=driver.findElements(By.xpath("//tr/td[1]")); 	//capture all elements into list
		List nameslist=names.stream().map(s->s.getText()).collect(Collectors.toList());
		System.out.println(nameslist);
		List Sortedlist=(List) nameslist.stream().sorted().collect(Collectors.toList());
		System.out.println(Sortedlist);
		//Assert.assertEquals(nameslist, Sortedlist);
		Assert.assertTrue(nameslist.equals(Sortedlist));
		List<String> price;
		
		//print price of beans
		do {
			List<WebElement> namesNew=driver.findElements(By.xpath("//tr/td[1]")); 
			price=namesNew.stream().filter(s->s.getText().contains("Rice")).map(s->getprice(s)).collect(Collectors.toList());
			if(price.size()<1)
			{
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
			
		}while(price.size()<1);
		
		
		
		price.forEach(s->System.out.println(s));
		

	}
	

}
