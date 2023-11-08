package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromProperties {

	public static void main(String[] args) throws IOException {
		// step:1 covert physical file into java readable object
		// new FileInputStream()--> throws FileNotFoundException
		FileInputStream fis = new FileInputStream("./src/test/resources/data.properties");
		
		// Step:2 Create an instance for Properties class
		Properties property = new Properties();
		
		//Step:3 load all key-value pairs from fis to properties object
		// property.load(fis)-->throws IOException
		property.load(fis);
		
		//Step:4 fetch data
		System.out.println(property.getProperty("url"));
		System.out.println(property.getProperty("timeouts"));
		System.out.println(property.getProperty("username"));
		System.out.println(property.getProperty("password"));

	}

}
