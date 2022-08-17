package Pack_13Aug2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		
		dr.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		
		dr.manage().window().maximize();
		
		dr.findElement(By.id("txtUsername")).sendKeys("admin");
		Thread.sleep(2000);
		
		dr.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		//Thread.sleep(2000);
		//dr.findElement(By.className("button")).click();
		Thread.sleep(2000);
		dr.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(2000);
		dr.navigate().back();
		Thread.sleep(2000);
		dr.navigate().forward();
		Thread.sleep(2000);
		
		dr.close();
		
		
		
	}
	
}
