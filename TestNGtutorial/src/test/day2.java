package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	@Test(groups= {"Smoke"})
	public  void thirdtest() {
		// TODO Auto-generated method stub
		System.out.println("chinna");
	}
		
	@BeforeTest
	public  void beforetest() {
		// TODO Auto-generated method stub
		System.out.println("this will execte first");
	
		

	}

}
