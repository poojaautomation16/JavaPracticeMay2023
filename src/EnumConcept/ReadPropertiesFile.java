package EnumConcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
	

	public static void main(String[] args) {
		Properties prop = null;
		try {
			FileInputStream ip = new FileInputStream("./src/EnumConcept/config.properties");
			prop = new Properties();
				prop.load(ip);
			}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		    }
		catch (IOException e) {
			e.printStackTrace();
		   }
		
		String bName = prop.getProperty("browser");
			System.out.println(bName);
		
		

	}

}
