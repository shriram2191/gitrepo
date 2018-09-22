package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
WebDriver driver;

public LoginPage(WebDriver webdriver)
{
	
	driver=webdriver;
	PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//*[@id='ctl00_MainContent_username']")
WebElement username;

@FindBy(xpath="//*[@id='ctl00_MainContent_password']")
WebElement password;

@FindBy(xpath="//*[@id='ctl00_MainContent_login_button']")
WebElement login;


//	By username=By.xpath("//*[@id='ctl00_MainContent_username']");
//	By password=By.xpath("//*[@id='ctl00_MainContent_password']");
//	By login=By.xpath("//*[@id='ctl00_MainContent_login_button']");
	
	
		
	public void enterUsername(String userdata){
		//driver.findElement(username).sendKeys(userdata);
		username.sendKeys(userdata);
	}

	public void enterpassword(String passdata){
		//driver.findElement(password).sendKeys(passdata);
		password.sendKeys(passdata);
	}

	public void clicklogin(){
		//driver.findElement(login).click();
		login.click();
		
	}
	
	//public void dologin(String userd,String passd)
	

}
