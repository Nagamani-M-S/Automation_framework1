package runner_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom_script.Pom_Script;
import pom_script.Pom_Script1;

public class Runner_pom1 {
	@Test
	public void click1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Pom_Script1 p1=new Pom_Script1(driver);
		p1.username("nagamani");
		Thread.sleep(2000);
		p1.password("bns123");
		Thread.sleep(2000);
		p1.clicklogin();
		Thread.sleep(2000);
		p1.clicklogin();
	}
	
}
