package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

	
	WebDriver driver;
	

public Homepage(WebDriver webdriver)
{
	
	driver=webdriver;
	}
	
	By order=By.xpath("//*[@id=\"ctl00_logout\"]");
	String outputmessage;
	public String verifykorder()
	{
		if(driver.findElement(order).isDisplayed())
		{
			outputmessage= "login is success";
			return outputmessage;
		}
		
		else 
			outputmessage= "login is not success";
		return outputmessage;
	}
	
}
