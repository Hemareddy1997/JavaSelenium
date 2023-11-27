package seleniumNew2;

//import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethods.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/ ");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
		
		java.util.List<WebElement> values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		for(int i=0;i<values.size();i++)
		{
			//Integer.parseInt(values.get(i).getText());
			//System.out.println(Integer.parseInt(values.get(i).getText()));
			//System.out.println(values.get(i).getText());
			sum=sum+Integer.parseInt(values.get(i).getText());
			System.out.println( sum);
			
		}
		System.out.println(driver.findElement(By.cssSelector(".totalAmount")).getText());
		String s=driver.findElement(By.cssSelector(".totalAmount")).getText();
		driver.findElement(By.cssSelector(".totalAmount")).getText();
		int total=Integer.parseInt(s.split(":")[1].trim());
//		if(sum==total)
//		{
//			System.out.println("equal values");
//		}
//		else
//		{
//			System.out.println("");
//		}
		Assert.assertEquals(sum, total);

	}

}
