package Pack_10Aug2022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
	
	
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("www.facebook.com");
		dr.close();
		
		
		
	}

}
