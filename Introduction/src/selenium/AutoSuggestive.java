package selenium;

import java.util.List;

//import javax.sound.sampled.Line;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		driver.findElement(By.id("autosuggest")).sendKeys("aus");
		Thread.sleep(2000);
		List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option:options) 
		{
			if(option.getText().equalsIgnoreCase("Austria"))
			{
				option.click();
				break;
			}
		}
		
		//System.out.println(driver.findElement(By.id("ui-id-1")).getText());
		//System.out.println(driver.findElement(By.id("autosuggest")).getText());
	}

}
