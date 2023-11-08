package actoSuggestions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.List;

public class PrintingMobilePrices {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@class='_2kpZ61_2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("mobiles");
		driver.findElement(By.className("Loz3pu")).click();
		List<WebElement>mobileNames = (List<WebElement>) driver.findElement(By.className("_4rRo1T"));
		for(int i=0;i<mobileNames.size();i++)
		{
			String name =mobileNames.get(i).getText();
			String price = (String) driver.findElement(By.xpath("//div[text()='"+name+"']/ancestor::div[@class='_3pLy]"+"/desendant::div[@class='_30jeq3_1_WHN1']")).getText();
			System.out.println(name+"/t"+price);
		}
		driver.close();
			
		

	}

}
