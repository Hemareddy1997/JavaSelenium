package seleniumNew2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a=new SoftAssert();
		
		
		
		
		for(WebElement element:links)
		{
			String url=element.getAttribute("href");
			HttpURLConnection conn= (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int status=conn.getResponseCode();
			//System.out.println(status);
			//Assert.assertTrue(status<400, "this "+ element.getText() + " is broken link");  	//immeadiatly print 
			a.assertTrue(status<400, "this "+ element.getText() + " is broken link");		//stores all assertion values
			
			
			//code execution stops when it reports one broken link
//			if(status>403)
//			{
//				System.out.println("this "+ element.getText() + " is broken link");
//				//Assert.assertTrue(false);
//			}
		}
		a.assertAll();	
		
		
		
		
//		String url=driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href"); //get url with selenim
//		 HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();     //java method to check status code
//		 conn.setRequestMethod("HEAD");
//		 conn.connect();
//		 int status=conn.getResponseCode();
//		 System.out.println(status);

	}

}
