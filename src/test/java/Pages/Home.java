package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.Lib;

public class Home extends Lib {
	public static void myaccount (WebDriver driver) throws IOException {
		
//		WebElement myacc=driver.findElement(By.xpath(".//*[@id='account']/a"));
		
		WebElement myacc=findelement(driver,readproperties(driver,"myacc"));
		System.out.println("here is text     "+myacc.getText());
	}
	public static void printtitle1(WebDriver driver) {
		System.out.println("here is title of first page   "+printttl(driver));
		
	}
	public static void clickproca(WebDriver driver) throws InterruptedException, IOException {
//		WebElement ProdCa=driver.findElement(By.xpath("//a[text()='Product Category']"));
		WebElement ProdCa=findelement(driver,readproperties(driver, "ProdCa") );
		ProdCa.click();
		sleep(driver,2);
	
	}
}
