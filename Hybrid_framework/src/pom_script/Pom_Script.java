package pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_script.Base_page;

public class Pom_Script extends Base_page 
{
	//declaration
	@FindBy(name="login")
	private WebElement LoginBtn;

    //initialization
	public Pom_Script(WebDriver driver)
	{
		super(driver);
	}
	//utilization
	public void clicklogin()
	{
		LoginBtn.click();
	}
}
	
