package seleniumNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedFramesAss5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Nested Frames")).click();
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-top']")));
		//driver.findElement(By.cssSelector("frame[name='frame-top']"));
		System.out.println(driver.findElements(By.tagName("frame")).size());
		//driver.switchTo().frame(2);
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-middle']")));
		//System.out.println(driver.findElement(By.cssSelector("frame[name='frame-middle']")).getText());
		System.out.println(driver.findElement(By.id("content")).getText());

	}

}
