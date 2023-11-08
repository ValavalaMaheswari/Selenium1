package crossbrowserparallel;

import org.testng.annotations.Test;

public class SwiggyTest {

	public class GoogleTest extends BaseClass{
		@Test
		public void test() throws InterruptedException {
			driver.get("http://swiggy.com/");
			Thread.sleep(3000);
}
	}
}

	