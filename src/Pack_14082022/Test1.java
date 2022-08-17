package Pack_14082022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1
{
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://opensource-demo.orangehrmlive.com/");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Point p=new Point(400,200);
		dr.manage().window().setPosition(p);
		Thread.sleep(2000);
		System.out.println("get position:"+dr.manage().window().getPosition());
		
		dr.manage().window().maximize();
		Thread.sleep(2000);
		dr.close();
		
		
		
		//System.out.println("hello");
		
		
	}
	
	
	
}