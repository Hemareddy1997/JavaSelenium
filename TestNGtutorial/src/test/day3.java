package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	@Parameters({"URL","sendkeys"})
	@Test
	public void carloanweblogin(String urlname,String sendkeys)
	{
		// selenium
		System.out.println("weblogincar");
		System.out.println(urlname);
		System.out.println(sendkeys);

	}
	@BeforeMethod
	public void bfmethod()				
	{
		System.out.println("this will execute before class");
	}
	
	@Test(enabled=false)					//this block skipped from execution flow
	public void mobilelogincarloan()
	{
		// appium
		System.out.println("carmbl login");

	}
	@Test(dependsOnMethods= {"carloanapilogin"})		//this will execute before mobilelogoutcarloan
	public void mobilelogoutcarloan()
	{
		// appium
		System.out.println("carmbl logout");

	}
	
	@Test(dataProvider="getdata")		                                     
	public void websignoutcarloan(String username,String password)
	{
		// appium
		System.out.println("web signoutcarloan");
		System.out.println(username);
		System.out.println(password);

	}
	@BeforeSuite
	public void bfsuite()
	{
		System.out.println("i am no 1");
	}
	
	
	@Test(dependsOnMethods= {"carloanweblogin"})
	public void carloanapilogin()
	{
		// restapi
		System.out.println("apilogincar");

	}
	
	@DataProvider
	public Object[][] getdata()
	{
		//1st username password---good credit history
		//2nd username password-----no history
		//3rd username password-----fault history
		Object[][] data=new Object[3][2];		//multi deminsional objectarray
		data[0][0]="first username";
		data[0][1]="password";
		
		data[1][0]="second username";
		data[1][1]="password";
		
		data[2][0]="third username";
		data[2][1]="password";
		return data;
	}

}
