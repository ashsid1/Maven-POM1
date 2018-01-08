package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Util.Lib;

public class Imacs extends Lib{

	public static void printtitle5(WebDriver driver) {
		System.out.println("here is the title page for imacs     "+printttl(driver));
	}
	
	public static void clickonacc(WebDriver driver) throws InterruptedException, IOException {
		
		Actions ac=new Actions (driver);
		
		ac.moveToElement(findelement(driver, readproperties(driver, "ProdCa"))).build().perform();
		sleep(driver,2);
		findelement(driver,"//a[text()='Accessories']").click();
		sleep(driver,2);
	}
}
