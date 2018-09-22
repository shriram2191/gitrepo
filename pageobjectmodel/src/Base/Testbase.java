
package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbase {

	 public static WebDriver driver;
	
	public void doinitalize()
	{
		driver=new ChromeDriver();
	}
	
	
}
