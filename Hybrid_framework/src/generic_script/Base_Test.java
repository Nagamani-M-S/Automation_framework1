package generic_script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Framework_constants{
	public WebDriver driver;
	@BeforeMethod
	public void openAppln()
	{
		System.setProperty(chrome_key,chrome_val);
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get(baseURL);
	}
	@AfterMethod
	public void closeAppln()
	{
		driver.close();
	}
	}


