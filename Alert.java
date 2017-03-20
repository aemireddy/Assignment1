package xpat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/swethareddyamireddy/Downloads/chromedriver-1" );
		WebDriver Driver = new ChromeDriver();
		Driver.get("http://www.tizagcom/javascriptT/javascriptalert.php");
	Driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div[2]/div[1]/a/div[1]/b[1]")).click();
	Driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
	Driver.switchTo().alert().getText();
Driver.switchTo().alert().accept();

	}

}
