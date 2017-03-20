package xpat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class indeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/swethareddyamireddy/Downloads/chromedriver-1" );
		WebDriver Driver = new ChromeDriver();
		Driver.navigate().to("http://www.indeed.com");
		Driver.findElement(By.xpath(".//*[@id='fj']")).click();
		Driver.findElement(By.xpath(".//*[@id='jobsearch']/table/tbody/tr[2]/td[4]/div/a")).click();
		Driver.findElement(By.xpath(".//*[@id='as_and']")).sendKeys("qa");
		Driver.findElement(By.xpath(".//*[@id='as_phr']")).sendKeys("quality analyst");
		Driver.findElement(By.xpath(".//*[@id='jt']")).click();
		Driver.findElement(By.xpath(".//*[@id='jt']/option[7]")).click();
	Driver.findElement(By.xpath(".//*[@id='norecruiters']")).click();
	
	}
	

}
