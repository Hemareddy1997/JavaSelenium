package seleniumNew;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class vegAndFruits {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	//implicit wait
		
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));	//explicit wait declaration
		
	//	WebDriverWait w =new WebDriverWait(driver,10);
		String[] items = { "Brocolli", "Cucumber", "Tomato" };
		additems(driver,items);
		//vegAndFruits o=new vegAndFruits(); //if method is not static then create object for that class and
		//o.additems(driver, items); //call method using that object name,
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//div[@class='cart-preview active']/div/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("promoBtn")).click();
	    //Thread.sleep(6000);
		//explicit wait
		//WebDriverWait w=new WebDriverWait(driver,5);
		
		//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("span.promoInfo")));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
	
				
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		driver.close();
		
		
		}
	

private static Duration durationofseconds(int i) {
		// TODO Auto-generated method stub
		return null;
	}


public static  void additems(WebDriver driver,String[] items)
{
	List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
	//Thread.sleep(1000);
	int j=0;
	
	for (int i = 0; i < products.size(); i++) 
	{
		String[] names = products.get(i).getText().split("-");
		String formatedName = names[0].trim();
		List<String> itemslist = Arrays.asList(items);
		
		if (itemslist.contains(formatedName)) 
		{
			j++;
			 driver.findElements(By.xpath("//div[@class=\"product-action\"]/button")).get(i).click();
			 if(j==items.length)
			 {
				 break;
			 }

		}
	}
}
}

