 package Pack_08Aug22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1
{
	
public static void main(String [] args) throws InterruptedException

{
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver dr=new ChromeDriver();
	/*dr.get("file:///C:/Users/LENOVO/Desktop/Agile/Automation/html/registration%20page1.html");
	String str=dr.getTitle();
	dr.manage().window().maximize();
	Thread.sleep(2000);
	
	dr.findElement(By.id("u1")).sendKeys("Rahul");

	Thread.sleep(2000);
	dr.findElement(By.className("cl1")).sendKeys("abc@123");
	Thread.sleep(2000);
     //dr.findElement(By.name("n1"));
	
	dr.findElement(By.linkText("go to google")).click();
	
	*/
	
	dr.get("https://www.flipkart.com/");
	dr.findElement(By.className("_3704LK")).sendKeys("mobile phones");
	Thread.sleep(2000);
	dr.findElement(By.className("L0Z3Pu")).click();
	Thread.sleep(3000);
	//System.out.println("title of web  page:"+str);
	dr.close();
}
}
