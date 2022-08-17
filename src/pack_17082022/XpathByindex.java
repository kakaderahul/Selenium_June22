package pack_17082022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByindex {
	
	public static void main(String [] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		/*dr.navigate().to("https://www.facebook.com/");
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.manage().window().maximize();
		*/
		/*dr.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("abcd");
		*////html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input
        
		dr.navigate().to("file:///C:/Users/LENOVO/Desktop/Agile/Automation/html/homepage.html");
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.manage().window().maximize();
		
		dr.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("abcdf");
		
		
		Thread.sleep(2000);
		dr.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("fghijk");
		Thread.sleep(2000);
		dr.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("lmnopq");
		Thread.sleep(2000);
		dr.close();
		
		
	}

}
