package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("hema");
//
//	}
	@Test
	public void demo()
	{
		System.out.println("hemalatha");
	}
	@AfterSuite
	public void afsuite()
	{
		System.out.println("this is no 1 from last");
	}
	@Test(timeOut=4000)
	public void secondtest()
	{
		System.out.println("reddy");
		Assert.assertTrue(false);
	}
	
	@Test(groups= {"Smoke"})
	public void thirdtest()
	{
		System.out.println("sai");
	}
	@AfterTest
	public void lasttest()
	{
		System.out.println("this will execute last");
	}

}
