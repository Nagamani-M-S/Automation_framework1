package runner_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom_script.Pom_Script;

public class Runner_pom {
@Test
public void click1() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	Pom_Script p1=new Pom_Script(driver);
	p1.clicklogin();
	Thread.sleep(2000);
	driver.navigate().refresh();
	p1.clicklogin();
	
	
}
}
