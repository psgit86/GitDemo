package qaclickacademy.Mavenjava;

import org.testng.annotations.Test;


public class RestAPITest {
	
	@Test
	public void RestAPITest1()
	{
		System.out.println("RestAPITest1");
	}
	
	@Test(enabled=true)
	public void RestAPITest2()
	{
		System.out.println("RestAPITest2");
	}

	
	@Test(enabled=true)
	public void RestAPITest3()
	{
		System.out.println("RestAPITest3");
	}

}
