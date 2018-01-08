package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Util.Lib;

public class Accessories extends Lib {

	public static void search(WebDriver driver) throws InterruptedException, IOException {
		
//		WebElement search=driver.findElement(By.xpath(".//*[@id='main-nav']/form/fieldset/input[1]"));
		
		WebElement Search=findelement(driver,".//*[@id='main-nav']/form/fieldset/input[1]");
//		Search.sendKeys("apple watch"+"\n");
		Search.sendKeys(readexcel(driver, 0, 0)+"\n");
		
		sleep(driver,2);
	}
}
