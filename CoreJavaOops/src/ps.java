import org.testng.annotations.BeforeMethod;

public class ps {

	
	public void getdata()
	{
		System.out.println("i am from patrent class");
	}
	
	@BeforeMethod
	public void beforerun()
	{
		System.out.println("i will run first");
	}
}
