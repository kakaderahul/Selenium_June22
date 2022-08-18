package Pack_18082022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	
	public static void sleep(int x) throws InterruptedException
	{
		Thread.sleep(x);
		
		
		
	}
	

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		/*WebElement webele=driver.findElement(By.xpath("//input[@class='inputtext _55r1 inputtext _1kbt inputtext _1kbt']"));
		webele.sendKeys("Rahul kakade");
		sleep(2000);
		webele.clear();
		sleep(2000);
		webele.sendKeys("9689828360");
		sleep(2000);*/
		/*boolean b=webele.isEnabled();
		
		if(b==true)
		System.out.println("status of the webelement is:"+b);
		else
		System.out.println("status of the element is :"+b);
		*/
		boolean b;
		String str=null;
		
		/*WebElement wb3=driver.findElement(By.xpath("//a[@rel='nofollow']"));
		wb3.click();
		
		WebElement wb4=driver.findElement(By.xpath("//input[@value='1']"));
		wb4.click();
		 b =wb4.isSelected();
	//	if(b==true)
		System.out.println("status of first radio button selection is: "+b);
		//sleep(2000);
		//WebElement wb5=driver.findElement(By.xpath("//input[@value='2']"));
		sleep(2000);*/
		/*WebElement wb5=driver.findElement(By.xpath("//a[@class='_97w5']"));
		str=wb5.getText();
		System.out.println("retun of getText() is:"+str);
		*/
	
		  WebElement web6= driver.findElement(By.xpath("//img[@class='_97vu img']"));
		 b=web6.isDisplayed();
		 System.out.println("status of the displayed function is :"+b);
		driver.close();
		
		
		
	}
	
	
	
}
