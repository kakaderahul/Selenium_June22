package Pack_15082022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://opensource-demo.orangehrmlive.com/");
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.manage().window().maximize();
		Thread.sleep(2000);
		//dr.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
		Thread.sleep(2000);
		dr.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin");
		Thread.sleep(2000);
		dr.findElement(By.xpath("//input[@class='button']")).click();
		Thread.sleep(2000);
	    dr.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
	    Thread.sleep(2000);
		dr.close();
	}
	
	
	
}