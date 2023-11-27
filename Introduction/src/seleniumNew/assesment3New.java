package seleniumNew;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assesment3New {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//div[@class='form-check-inline']/label[2]/span[2]")).click();
		Thread.sleep(2000);
		//driver.switchTo().alert();
		//WebDriverWait wait=new WebDriverWait(driver,20);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		WebElement options=driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdown=new Select(options);
		dropdown.selectByVisibleText("Consultant");
		driver.findElement(By.id("signInBtn")).click();
		Thread.sleep(4000);
		List<WebElement> products=driver.findElements(By.xpath("//button[@class='btn btn-info']"));
		for(int i=0;i<products.size();i++) {
			products.get(i).click();
		}
		driver.findElement(By.partialLinkText("Checkout")).click();
		Thread.sleep(2000);
		
		driver.close();

	}
}

