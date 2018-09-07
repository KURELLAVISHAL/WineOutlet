package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hompage
{
	public WebDriver driver;
	@FindBy(xpath="//*[text()='Log In']")
	public WebElement Logintab;
	public Hompage(WebDriver x)
	{
		this.driver=x; 
		PageFactory.initElements(driver, this);
	}
	public void clicklogin()
	{
		Logintab.click();
	}
}
