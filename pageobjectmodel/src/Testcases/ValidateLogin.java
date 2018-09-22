package Testcases;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Homepage;
import pages.LoginPage;
import utils.Testutils;

public class ValidateLogin extends Testutils {
WebDriver driver;

LoginPage login;
Homepage hp;
	@Before
	
	public void dointilization() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		login=new LoginPage(driver);
		hp=new Homepage(driver);
	}
	
	@Test
	public void validatelogin() 
	
	{
		login.enterUsername("Tester");
		login.enterpassword("test");
		login.clicklogin();

		String status=hp.verifykorder();
	try {	
		if(status.equals("login is success"))
		{
			System.out.println("login is sucessfull");
			takeScreenshot("success");
			
		}}
		catch(Exception t)
		{
			System.out.println("login is not sucessful");
	}
	}
	
	
	
}
