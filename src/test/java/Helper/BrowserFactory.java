package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver StartBrowser(String browserName,String url)
	{
		if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver(); 	
		}
		else if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "G:\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		/*else if(browserName.equalsIgnoreCase("IE"))
		{
			
		}*/
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
		
		
			
			
	}


}
