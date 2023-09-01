package pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic_script.Base_page;

public class Pom_Script1 extends Base_page {
	//declaration
		@FindBy(id="email")
		private WebElement unTbox;
		
		@FindBy(id="pass")
		private WebElement pwdTbox;
		
		@FindBy(name="login")
		private WebElement LoginBtn;

	    //initialization
		public Pom_Script1(WebDriver driver)
		{
			super(driver);
		}
		//utilization
		public void username(String un)
		{
			unTbox.sendKeys(un);
		}
		public void password(String pwd)
		{
			pwdTbox.sendKeys(pwd);
		}
		public void clicklogin()
		{
			LoginBtn.click();
		}
	}
		

