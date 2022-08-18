package pack_17082022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1
{
	
 public static void main(String [] args) throws InterruptedException
 {
	 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\selenium\\chromedriver_win32\\chromedriver.exe");
	 WebDriver dr=new ChromeDriver();
	 dr.get("https://www.facebook.com/");
	 dr.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 dr.manage().window().maximize();
	/* Thread.sleep(2000);
     dr.findElement(By.xpath("//input[@id='email']")).sendKeys("9689828360");
     Thread.sleep(4000);
     dr.findElement(By.xpath("//input[@id='pass']")).sendKeys("Rahul@080392");
     Thread.sleep(2000);
	 dr.findElement(By.xpath("//button[@name='login']")).click();*/
	 Thread.sleep(2000);
	 
	 //.findElement(By.linkText("Forgotten password?")).click();
	 /*dr.findElement(By.partialLinkText("Forgotten passw")).click();
	 
	 Thread.sleep(4000);
	 
	 dr.findElement(By.xpath("//button[@name='did_submit']")).click();
	 Thread.sleep(2000);
	*/
     
	 //.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
	 
	//r.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	 //read.sleep(2000);
	 
	 dr.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("9689828360");
	 Thread.sleep(2000);
	 dr.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("Rahul@080392");
	 
	 Thread.sleep(2000);
	//dr.findElement(By.xpath("//button[@id='loginbutton']")).click();
	//r.findElement(By.xpath("//button[@name='login']")).click();
	
	 dr.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
	
	// dr.findElement(By.xpath("//button[@name='login']")).click();
	 Thread.sleep(20000);
	 dr.close();
	 
	 
	 
	 
	 
	 
 }



}