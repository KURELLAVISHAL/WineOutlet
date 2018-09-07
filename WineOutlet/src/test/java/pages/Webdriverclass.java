package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webdriverclass 
{
	public WebDriver driver;
	  public void waitForElementPresence(WebElement elmt) {
	        Wait<WebDriver> wait = new WebDriverWait(driver,100);
	        wait.until(ExpectedConditions.visibilityOf(elmt));
	    }
	  public void waitForElementVisibility(By by) {
	        Wait<WebDriver> wait = new WebDriverWait(driver, 100);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	    }
}
