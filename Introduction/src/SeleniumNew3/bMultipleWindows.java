package SeleniumNew3;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bMultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);	//new tab opened,but driver have access on only first window
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> windowsId=windows.iterator();
		String parentId=windowsId.next();
		String childId=windowsId.next();
		driver.switchTo().window(childId);
		
		driver.get("https://rahulshettyacademy.com/");
		String nameText=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).
		get(1).getText();
		driver.switchTo().window(parentId);
		
		
		
		driver.findElement(By.cssSelector("[name='name']")).sendKeys(nameText);

	}

}
