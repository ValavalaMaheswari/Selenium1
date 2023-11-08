package groupexecution;

import org.testng.annotations.Test;

public class TestClasses4 {
	@Test
	public void demo1() {
		System.out.println("TestClass4");
	}
	
	@Test(groups={"smoke","regression","sanity"})
	public void demo2() {
		System.out.println("TestClass4 - demo2 -  smoke,regression,sanity");
	}
	@Test
	public void demo3() {
		System.out.println("TestClass4");

}
}

