package runner_script;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic_script.Excel_generic;

public class Facebook_login extends Excel_generic
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	String val1 = Excel_generic.ddt("sheet1", 0, 0);
	String val2 = Excel_generic.ddt("sheet1", 1, 1);
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys(val1);
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(val2);
	driver.findElement(By.xpath("//button[@name='login']")).click();
	
	
	
}
}
