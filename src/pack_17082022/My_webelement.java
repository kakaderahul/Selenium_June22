package pack_17082022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class My_webelement {
	
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement web= driver.findElement(By.name("email"));
		web.sendKeys("abcd");
		Thread.sleep(3000);
		web.clear();
		Thread.sleep(2000);
		
		driver.close();
		
		
	}
	

}
