package xpat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/swethareddyamireddy/Downloads/chromedriver-1" );
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.aa.com/homePage.do");
	Driver.findElement(By.xpath(".//*[@id='loginForm.loginId']")).sendKeys("swetha");
	Driver.findElement(By.xpath(".//*[@id='loginForm.lastName']")).sendKeys("aemireddy");
	Driver.findElement(By.xpath(".//*[@id='loginForm.password']")).sendKeys("7075079828");
	Driver.findElement(By.xpath(".//*[@id='loginForm']/div[2]/div[1]/label/span[1]")).click();
	
	
	}
	

}
