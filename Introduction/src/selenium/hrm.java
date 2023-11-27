package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hrm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("http://alchemy.hguy.co/orangehrm");
		Thread.sleep(1000);
		String title= driver.getTitle();
		//System.out.println(title);		
		//Assert.assertEquals(title, "OrangeHRM");
		if (title == "OrangeHRM")
		{
			System.out.println("orange hrm opened");
		}
		Thread.sleep(1000);
		driver.close();
		

	}

}
