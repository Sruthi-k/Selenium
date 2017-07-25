package Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class TestConfig {

	@Test
	public void testconfiguration() throws Exception
	{
		File src = new File("./Configuration/Config.property"); 
		FileInputStream fis = new FileInputStream(src);
		Properties pro = new Properties();
		pro.load(fis);
		String chromepath = pro.getProperty("ChromeDriver");
		System.out.println("Chrome path is == "+chromepath);
	}
}
