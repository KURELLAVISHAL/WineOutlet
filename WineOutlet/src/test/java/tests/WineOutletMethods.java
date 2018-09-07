package tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Hompage;
import pages.Loginpage;
import pages.MyAccountPage;
import pages.Webdriverclass;

public class WineOutletMethods
{
	public WebDriver driver;
	public Hompage hp;
	public Loginpage lp;
	public MyAccountPage mp;
	public Properties pro;
	public Scenario s;
	Webdriverclass wwait=new Webdriverclass();
	
	@Before
	public void method1(Scenario x) throws Exception
	{
		//use scenario object for current scenario
		this.s=x;
		//load properties file in current scenario
		pro=new Properties();
		FileInputStream fip=new FileInputStream("E:\\automation\\WineOutlet\\src\\test\\resources\\wineOutletResources\\Properties.properties");
		pro.load(fip);
		System.setProperty("webdriver.chrome.driver", pro.getProperty("gdpath"));
		driver=new ChromeDriver();
		hp=new Hompage(driver);
		lp=new Loginpage(driver);
		mp=new MyAccountPage(driver);
		
	
	}
	
	@Given("^launch WineOutlet site$")
	public void method2() throws Exception
	{
		driver.get(pro.getProperty("url"));
		wwait.waitForElementPresence(hp.Logintab);
		
	}

	@Then("^title is \"(.*)\" value$" )
	public void method3(String x)
	{
		String t=driver.getTitle();
		if(t.equals(x))
		{
			s.write("title test is passed");
		}
	}
	@And("^close site$")
	public void method4()
	{
		driver.close();
	}
	
	@When("^click on login button$")
	public void method5() throws Exception
	{
		hp.clicklogin();
		Thread.sleep(5000);
	}
	@And("^enter emailid with \"(.*)\" value$")
	public void method6(String x) throws Exception
	{
		lp.filluserid(x);
		Thread.sleep(5000);
	}
	@And("^click on yes i have password$")
	public void method7() throws Exception
	{
		lp.clickpwdradio();
		Thread.sleep(5000);
	}
	@And("^enter password with \"(.*)\" value$")
	public void method8(String y) throws Exception
	{
		lp.fillpwdbtn(y);
		Thread.sleep(5000);
	}
	@And("^click continue button$")
	public void method9() throws Exception
	{
		lp.loginClick();
		Thread.sleep(5000);
	}
	@Then("^validate fields with \"(.*)\" value$")
	public void method10(String x)
	{
		if(x.equalsIgnoreCase("blank")&&lp.usererr.isDisplayed())
		{
			s.write("blank test passed");
		}
		else if(x.equalsIgnoreCase("blankpwd")&&lp.error.isDisplayed())
		{
			s.write("blank err test passed");
		}
		else if(x.equalsIgnoreCase("invalidpwd")&&lp.error.isDisplayed())
		{
			s.write("invalidpwd test passed");
		}
		else if(x.equalsIgnoreCase("invaliduser")&&lp.error.isDisplayed())
		{
			s.write("invaliduser test passed");
		}
		else if(x.equalsIgnoreCase("valid")&&mp.placedorders.isDisplayed())
		{
			s.write("valid user test passed");
		}
	}




}
