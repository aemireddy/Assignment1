package xpat;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Virginamerica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/swethareddyamireddy/Downloads/chromedriver-1" );
		WebDriver Driver = new ChromeDriver();
		Driver.navigate().to("http://www.spirit.com");
		Driver.findElement(By.xpath("/html/body/div[3]/div[1]/a/span")).click();
		Driver.findElement(By.xpath(".//*[@id='flightOnlyWidgetOptions']/span[2]")).click();
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Driver.findElement(By.xpath(".//*[@id='departCityCodeSelect']")).click();
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Driver.findElement(By.xpath(".//*[@id='departCityCodeSelect']/option[2]")).click();
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
Driver.findElement(By.xpath(".//*[@id='destCityCodeSelect']")).click();
Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
Driver.findElement(By.xpath(".//*[@id='destCityCodeSelect']/option[35]")).click();
Driver.findElement(By.xpath(".//*[@id='departDate']")).click();

Driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[7]/a")).click();
Driver.findElement(By.xpath(".//*[@id='returnDate']")).click();
	}

}
