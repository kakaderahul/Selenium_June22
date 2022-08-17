package Pack_14082022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname_locator
{
   public static void main(String [] args) throws InterruptedException
   {
	   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium\\chromedriver_win32\\chromedriver.exe");
	   WebDriver dr=new ChromeDriver();
	   dr.get("https://opensource-demo.orangehrmlive.com/");
	   dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   dr.manage().window().maximize();
	   Thread.sleep(2000);
	   /*// by tagname
	   WebElement e=  dr.findElement(By.tagName("input"));
	   e.sendKeys("admin");
	   Thread.sleep(4000);
	   // by id locator
	   */
	   
	 /* WebElement e1 =dr.findElement(By.id("txtUsername"));
	  e1.sendKeys("admin");
	  WebElement e2=dr.findElement(By.id("txtPassword"));
	  e2.sendKeys("admin");
	//  e2.sendKeys("admin123");
	  WebElement e3=dr.findElement(By.id("btnLogin"));
	  e3.click();
	  
	  */
	  
	   /*dr.findElement(By.name("txtUsername")).sendKeys("admin");
	   Thread.sleep(2000);
	   dr.findElement(By.name("txtPassword")).sendKeys("admin123");
	   Thread.sleep(2000);
       dr.findElement(By.className("button")).click();
       */
	   
	   /// linktext
	   
	  // dr.findElement(By.linkText("Forgot your password?")).click();
	   dr.findElement(By.partialLinkText("Forgot ")).click();
	   
	   Thread.sleep(2000);
	   
	   dr.findElement(By.className("searchValues")).click();
	   Thread.sleep(2000);
	   dr.findElement(By.className("cancel")).click();
	   Thread.sleep(2000);
	   
	   dr.close();
	   
	   
	   
	   
	   
	   
   }



}