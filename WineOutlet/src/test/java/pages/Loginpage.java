package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
	public WebDriver driver;
	@FindBy(xpath="//*[@name='username']")
	public WebElement username;
	@FindBy(xpath="//*[text()='Enter your username']")
	public WebElement usererr;
	@FindBy(xpath="//*[text()='The e-mail address or password is incorrect. Please try again.']")
	public WebElement error;
	@FindBy(xpath="(//*[@name='ISPASS'])[2]")
	public WebElement pwdbtn;
	@FindBy(xpath="//*[@name='password']")
	public WebElement pwd;
	@FindBy(xpath="//*[@name='Continue']")
	public WebElement Login;
	
	public Loginpage(WebDriver x)
	{
		this.driver=x;
		PageFactory.initElements(driver, this);
	}
	public void filluserid(String x)
	{
		username.sendKeys(x);
	}
	public void clickpwdradio()
	{
		pwdbtn.click();
	}
	public void fillpwdbtn(String x)
	{
		pwd.sendKeys(x);
	}
	
	public void loginClick()
	{
		Login.click();
	}
}
