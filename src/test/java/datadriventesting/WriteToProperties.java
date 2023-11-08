package datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToProperties {

	public static void main(String[] args) throws IOException {
		// Step:1 Convert physical file into java readable object
		FileInputStream fis = new FileInputStream("./src/test/resources/data.properties");
		
		//Step:2 Create an instance of properties class
		Properties property = new Properties();
		
		//Step:3 Load all the key-value pairs into Properties object
		property.load(fis);
		
		//Step:4 Write the Properties object
		property.put("user2", "trainee");
		property.put("pwd2","trainee");
		
		//Step:5 Save the file
		FileOutputStream fos = new FileOutputStream("./src/test/resources/data.properties");
		property.store(fos,"Updated Successsfully");

	}

}

