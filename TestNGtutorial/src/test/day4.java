package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	
	@Test
	public void homeloanweblogin()
	{
		// selenium
		System.out.println("webloginhome");

	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("before executing any method in the class");
	}
	@BeforeMethod
	public void bfmethod()
	{
		System.out.println("this will execute before each TC");
	}
	@Parameters({"URL"})
	@Test
	public void homeloanmobilelogin(String urlname)
	{
		// appium
		System.out.println("mblloginhome");
		System.out.println(urlname);

	}
	
	@Test
	public void homeloanapilogin()
	{
		// restapi
		System.out.println("apiloginhome");

	}
	@AfterClass
	public void afetrclass()
	{
		System.out.println("this will execute after all methods");
	}

}
