package xpat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmailsignup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/swethareddyamireddy/Downloads/chromedriver-1" );
		WebDriver Driver = new ChromeDriver();
		
		Driver.navigate().to("https://www.facebook.com/");
		Driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("swetha");
		Driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("7075079828");
		Driver.findElement(By.xpath(".//*[@id='u_0_q']")).click();
		Driver.findElement(By.xpath(".//*[@id='reg-link']")).click();
		Driver.findElement(By.xpath(".//*[@id='u_0_1']")).sendKeys("swetha");
		Driver.findElement(By.xpath(".//*[@id='u_0_3']")).sendKeys("reddy");
		Driver.findElement(By.xpath(".//*[@id='u_0_6']")).sendKeys("7075079828");
		Driver.findElement(By.xpath(".//*[@id='u_0_d']")).sendKeys("swethareddy");
		Driver.findElement(By.xpath(".//*[@id='month']")).click();
		
		
			
			
		


}
}
