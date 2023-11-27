package seleniumNew;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assesment3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//div[@class='form-check-inline']//label[2]//span[2]")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Thread.sleep(3000);
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		
		//System.out.println(driver.switchTo().alert().getText());
		//driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//div[@class='modal-footer justify-content-center']//button[2]")).click();
		//driver.findElement(By.id("okayBtn")).click();
		WebElement options=driver.findElement(By.cssSelector("select.form-control"));
		Select dropdown=new Select(options);
		dropdown.selectByValue("consult");
		//driver.findElement(By.cssSelector("select.form-control")).click();
		//driver.findElement(By.xpath("//select[@class='form-control']//option[3]")).click();
		
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		
		//driver.close();
		
		
		//Adding items
		Thread.sleep(4000);
		List<WebElement> items=driver.findElements(By.xpath("//app-card[@class='col-lg-3 col-md-6 mb-3']"));
		int k=items.size();
		for(int i=0;i<k;i++) {
			//items.get(i).click();
			//k.get(i).click();
			
		
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		driver.close();
		}
		
		

	}
 public static void login(){
	 
 }
}
