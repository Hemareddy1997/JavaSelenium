import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ps1 extends ps {

	@Test
	public void testrun() 	//beforemethod execute first because this class inherits properties from ps
	{
		getdata();
		//int a=3;
		ps2 ps2=new ps2(3);
	    System.out.println(ps2.increment());
	    System.out.println(ps2.decrement());
//	    ps3 ps3new=new ps3();
//	    System.out.println(ps3.increment(3));	//WITHOUT constructor
//	    ps3 ps3=new ps3();//this step have to change 
//	    System.out.println(ps3.multiplytwo(5));  
	    System.out.println(ps2.multiplythree());
	    
	    
	    
	}
	
	
	
	@AfterMethod
	public void afterrun()
	{
		System.out.println("run me last");
	}
}
