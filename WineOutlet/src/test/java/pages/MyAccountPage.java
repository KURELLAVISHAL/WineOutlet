package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage
{
	public WebDriver driver;
	@FindBy(xpath="//*[text()='Recently Placed Orders']")
	public WebElement placedorders;
	public MyAccountPage(WebDriver x)
	{
		this.driver=x;
		PageFactory.initElements(driver,this);
	}
}
