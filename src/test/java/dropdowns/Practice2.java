package dropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement dropdown = driver.findElement(By.id("cars"));
		Select s = new Select(dropdown);
		if(s.isMultiple()) {
			s.selectByIndex(0);
			s.selectByValue("99");
			s.selectByVisibleText("INR 100 - INR 199 ( 16 ) ");
			Thread.sleep(2000);
			System.out.println("First selected option:"+s.getFirstSelectedOption().getText());
			List<WebElement>selectedOptions = s.getAllSelectedOptions();
			System.out.println("**** Selected Options ****");
			for (WebElement Option : selectedOptions) {
				System.out.println(Option.getText());
				
			}
			s.deselectByIndex(0);
			
			
		}
		else
		{
			System.out.println("single select dropdown");
		}

     driver.close();
	}
	

}
