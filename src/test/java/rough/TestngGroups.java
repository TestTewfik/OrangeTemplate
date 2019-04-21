package rough;

import org.testng.annotations.Test;

import base.TestBase;

public class TestngGroups extends TestBase {

	@Test(groups= {"Sanity"})
	public void test1() {
		System.out.println("This is test 1");
	}
	
	@Test(groups= {"Sanity","Smoke"})
	public void test2() {
		System.out.println("This is test 2");
	}
	
	@Test(groups= {"Sanity","Regression"})
	public void test3() {
		System.out.println("This is test 3");
	}
	
	
	@Test
	public void test4() {
		System.out.println("This is test 4");
	}
}
