package xpat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/swethareddyamireddy/Downloads/chromedriver-1" );
		WebDriver Driver = new ChromeDriver();

Driver.navigate().to("http://google.com/");
Driver.findElement(By.xpath(".//*[@id='gbwa']/div[1]/a")).click();
Driver.findElement(By.xpath(".//*[@id='gb49']")).click();
Driver.findElement(By.xpath("/html/body/section/div[3]/a/div[2]")).click();



	}

}
