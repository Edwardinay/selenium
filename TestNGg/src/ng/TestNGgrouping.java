package ng;

import org.testng.annotations.Test;
  @Test(groups= {"all class test"})
public class TestNGgrouping {
	
	@Test(groups= {"window.sanity"})
	public void testone() {
		System.out.println("testone is pass");
		
	}
	@Test(groups= {"window.sanity"})
	public void testtwo() {
		System.out.println("testtwo is pass");
	}
	@Test(groups= {"linux.smoke"})
	public void testthree() {
		System.out.println("testthree is pass");
	}
	@Test(groups= {"ios.smoke","sanity"})
	public void testfour() {
		System.out.println("testfour is pass");
	}
	@Test(groups= {"smoke","sanity","bbt"})
	public void testfive() {
		System.out.println("testfive is pass");
	}
		
		
			

}
