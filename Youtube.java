package xpat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/swethareddyamireddy/Downloads/chromedriver-1" );
		WebDriver Driver = new ChromeDriver();
		Driver.navigate().to("https://www.youtube.com/");
		Driver.findElement(By.xpath(".//*[@id='masthead-search-term']")).sendKeys("telugu movies 2016");
		Driver.findElement(By.xpath("//*[@id='search-btn']/span")).click();
		Driver.findElement(By.xpath(".//*[@id='yt-masthead-signin']/div/button/span")).click();
		Driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("1503011306@svuca.edu");
		
		Driver.findElement(By.xpath(".//*[@id='next']")).click();
		Driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("7075079828");
		
		
		
		
	}

}
