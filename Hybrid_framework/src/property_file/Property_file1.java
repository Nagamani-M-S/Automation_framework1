package property_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Property_file1 
{
@Test
public void test1() throws FileNotFoundException, IOException
{
	Properties p= new Properties();
	p.load(new FileInputStream("./property.properties"));
	String val = p.getProperty("baseurl");
	System.out.println(val);
	
	
	
}
}