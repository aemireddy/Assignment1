package xpat;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			System.setProperty("webdriver.chrome.driver","/Users/swethareddyamireddy/Downloads/chromedriver-1" );
			WebDriver Driver = new ChromeDriver();
			Driver.navigate().to("https://www.amazon.com/");
			Driver.findElement(By.xpath(".//*[@id='nav-link-prime']/span[2]")).click();
			Driver.findElement(By.xpath("//*[@id='a-autoid-0']/span/input")).click();
			Driver.findElement(By.xpath(".//*[@id='ap_email']")).sendKeys("swethareddy@gmail.com");
			Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Driver.findElement(By.xpath(".//*[@id='ap_password']")).sendKeys("pandureddy");
			Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Driver.findElement(By.xpath(".//*[@id='signInSubmit']")).click();
			Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Driver.findElement(By.xpath(".//*[@id='createAccountSubmit']")).click();
			Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Driver.findElement(By.xpath(".//*[@id='ap_customer_name']")).sendKeys("swetha");
			Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Driver.findElement(By.xpath(".//*[@id='ap_email']")).sendKeys("1503011306@svuca.edu");
			Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Driver.findElement(By.xpath(".//*[@id='ap_password']")).sendKeys("7075079828");
			Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Driver.findElement(By.xpath(".//*[@id='ap_password_check']")).sendKeys("7075079828");
			Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Driver.findElement(By.xpath(".//*[@id='continue']")).click();
			Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Driver.findElement(By.xpath(".//*[@id='a-page']/div[1]/div[3]/div/div[2]/div[3]/div/a")).click();
			
			
			
			
			
	}

}
