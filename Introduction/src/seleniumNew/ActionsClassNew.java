package seleniumNew;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClassNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();	
		System.out.println(driver.getTitle());
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("jeans tops").doubleClick().build().perform();
		
	
		//MOVE TO SPECIFIC ELEMENT
		WebElement move=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		a.moveToElement(move).build().perform();
		a.moveToElement(move).contextClick().build().perform();
	}

}
