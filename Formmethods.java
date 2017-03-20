package xpat;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Formmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/swethareddyamireddy/Downloads/chromedriver-1" );
		WebDriver Driver = new ChromeDriver();
		Driver.navigate().to("http://www.facebook.com");
		
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Driver.findElement(By.cssSelector("#u_0_1")).sendKeys("swetha");
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Driver.findElement(By.cssSelector("#u_0_3")).sendKeys("reddy");
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Driver.findElement(By.cssSelector("#u_0_6")).sendKeys("7075079828");
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Driver.findElement(By.cssSelector("#u_0_9")).sendKeys("7075079828");
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Driver.findElement(By.cssSelector("#u_0_d")).sendKeys("7075079828");
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Driver.findElement(By.cssSelector("#month")).click();
		Driver.findElement(By.xpath(".//*[@id='month']/option[5]")).click();
		Driver.findElement(By.xpath(".//*[@id='day']")).click();
		Driver.findElement(By.xpath(".//*[@id='day']/option[24]")).click();
		Driver.findElement(By.xpath(".//*[@id='year']")).click();
		Driver.findElement(By.xpath(".//*[@id='year']/option[25]")).click();
		Driver.findElement(By.xpath(".//*[@id='u_0_m']")).click();
		
		
		System.out.println(Driver.findElement(By.xpath(".//*[@id='u_0_p']/span[1]/label")).isDisplayed());
		
		
		
		
		
		
	}

}
