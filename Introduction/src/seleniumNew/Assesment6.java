package seleniumNew;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assesment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText());
		String optionname=driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();
		driver.findElement(By.id("dropdown-class-example")).click();
		//WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
		

		Select select = new Select(driver.findElement(By.id("dropdown-class-example")));
		select.selectByVisibleText(optionname);
		//List<WebElement> selectedOptions = select.getOptions();
		//List<WebElement> selectedOptions = select.getAllSelectedOptions();
		//System.out.println(selectedOptions.size());
//		for(int i=0;i<selectedOptions.size();i++)
//		{
//			
//			System.out.println(selectedOptions.get(i));
//		}
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(optionname);
		driver.findElement(By.id("alertbtn")).click();
		String alertText=driver.switchTo().alert().getText();
		System.out.println(driver.switchTo().alert().getText());
		if(alertText.contains(optionname))
		{
			System.out.println("message displayed");
		}
		else
		{
			System.out.println("failed to display text");
		}
		

	}

}
