package SeleniumNew3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import static org.openqa.selenium.support.locators.Relativelocator.*;
import static org.openqa.selenium.support.locators.RelativeLocator.*; 


import io.github.bonigarcia.wdm.WebDriverManager;

public class aRelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement textbox =driver.findElement(By.xpath("//div[@class='form-group']//input[@name='name']"));
		
		System.out.println(driver.findElement(with(By.tagName("label")).above(textbox)).getText());
		
		//relative locator for below 
		WebElement dob=driver.findElement(By.cssSelector("[for='dateofBirth']"));
		//System.out.println(driver.findElement(with(By.tagName("input")).below(dob)).getText()); //flex component will not execue, next input label it consider
		driver.findElement(with(By.tagName("input")).below(dob)).click();
		
		//left relative locator
		WebElement checkbox=driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(checkbox)).click();
		
		//right relative locator
		WebElement radiobutton=driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radiobutton)).getText());
		
	}

	

}
