package seleniumNew;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowsAss4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.partialLinkText("Multiple")).click();
		driver.findElement(By.xpath("//div[@id='content']/div/a")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		//Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		driver.switchTo().window(parentid);
		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());

	}

}
