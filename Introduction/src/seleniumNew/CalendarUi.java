package seleniumNew;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarUi {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/railways?utm_source=google&utm_medium=search&utm_campaign=LS_Redrail_DSA_21-03-23&utm_term=&device=c&utm_matchtype=&utm_network=g&utm_placement=&utm_content=651833538612&utm_Adposition=&utm_location=9183214&utm_Sitelink=}&utm_Audience=dsa-1978227635934&utm_campaignid=19856031587&utm_adgroupid=146591971385&utm_adgroup=&gad=1&gclid=Cj0KCQjwm66pBhDQARIsALIR2zCsnNU3z5HnaddT1aoKYh1pWuOOPdpnKdD6xKdw-OYTpbPnm8WexocaApHIEALw_wcB");
		//driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".home_date_wrap")).click();
		Thread.sleep(3000);
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		while(!driver.findElement(By.cssSelector("[class='sc-gZMcBi fSiRuE'] [class='sc-gqjmRU fnURhG']")).getText().contains("DEC2023"))
//		{
//			driver.findElement(By.cssSelector("[class='sc-gZMcBi fSiRuE'] [class='sc-gqjmRU fnURhG']")).click();
//		}
		
	
		
//		while(!driver.findElement(By.xpath("//div[@class='sc-gZMcBi fSiRuE']//div[2]")).getText().contains("DEC2023"))
//		{
//		driver.findElement(By.xpath("//div[@class='sc-gZMcBi fSiRuE']//div[2]")).click();	
//		}
		
		//List<WebElement> dates=driver.findElements(By.cssSelector("[class='sc-jTzLTM cSXDfm'] [class='sc-gzVnrw ktEypG']"));
		int count =driver.findElements(By.cssSelector("[class='sc-jTzLTM cSXDfm'] [class='sc-gzVnrw ktEypG']")).size();
		for(int i=0;i<count;i++) 
		{
		 String text=driver.findElements(By.cssSelector("[class='sc-jTzLTM cSXDfm'] [class='sc-gzVnrw ktEypG']")).get(i).getText();
		 if(text.equalsIgnoreCase("30"))
		 {
			 
			 System.out.println(driver.findElements(By.cssSelector("[class='sc-jTzLTM cSXDfm'] [class='sc-gzVnrw ktEypG']")).get(i).getText());
			 driver.findElements(By.cssSelector("[class='sc-jTzLTM cSXDfm'] [class='sc-gzVnrw ktEypG']")).get(i).click();
			 break;
		 }
		}
		//Thread.sleep(3000);
		//System.out.println(driver.findElement(By.xpath("//div[@class='elementor-form-fields-wrapper elementor-labels-above']/div[3]/input")).getText());
		//driver.findElement(By.xpath("//div[@class='elementor-form-fields-wrapper elementor-labels-above']/div[3]/input")).click();
		//driver.findElement(By.className("elementor")).click();
		//driver.findElement(By.cssSelector("#form-field-travel_comp_date")).click();
//		Thread.sleep(3000);
//		//driver.close();
//		
//		WebElement element = driver.findElement(By.xpath("//div[@class='elementor-form-fields-wrapper elementor-labels-above']/div[3]/input"));
//
//		Actions actions = new Actions(driver);
//
//		actions.moveToElement(element).click().build().perform();
//		driver.findElement(By.cssSelector("#form-field-travel_comp_date")).click();
	//	driver.findElement(By.id("form-field-travel_comp_date_between")).click();
	}

}
