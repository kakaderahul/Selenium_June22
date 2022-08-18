package Pack_18082022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox{
	
	public static void wait(int x) throws InterruptedException
	{
		Thread.sleep(x);
		
		
	}
	
	public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/login/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Sign up for Facebook')]")).click();
		wait(2000);
		WebElement wbl1= driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' and  @name='firstname' ]"));
		wbl1.sendKeys("rahul");
	    wait(1000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kakade");
	    wait(2000);
	    driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("rahul@gmail.com");
		wait(2000);
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("aaa");
		wait(2000);
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("rkus");
		wait(1000);
		WebElement wb2=  driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select sl1=new Select(wb2);
		sl1.selectByIndex(7);
		wait(1000);
		wb2=driver.findElement(By.xpath("//select[@title='Month']"));
		Select sl2=new Select(wb2);
		sl2.selectByValue("3");
		wait(2000);
		wb2=driver.findElement(By.xpath("//select[@aria-label='Year']"));
		Select sl3=new Select(wb2);
		sl3.selectByVisibleText("1993");
		wait(1000);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		wait(2000);
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		wait(4000);
		
		
		
		driver.close();
		
		
		
	}
	
	
	
	
}