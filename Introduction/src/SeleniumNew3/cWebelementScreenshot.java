package SeleniumNew3;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cWebelementScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);	
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> windowsId=windows.iterator();
		String parentId=windowsId.next();
		String childId=windowsId.next();
		driver.switchTo().window(childId);
		
		driver.get("https://rahulshettyacademy.com/");
		String nameText=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).
		get(1).getText();
		driver.switchTo().window(parentId);
		
		//to get screenshot
		
		WebElement name=driver.findElement(By.cssSelector("[name='name']"));
		//name.sendKeys(nameText);
		//File file=name.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(file,new File("C:\\hema\\screenshot.png"));
		
		//to get height and width of webelement
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getWidth());
		

	}

}
