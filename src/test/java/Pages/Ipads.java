package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import Util.Lib;

public class Ipads extends Lib{
	
	
	public static void printtitle4 (WebDriver driver) {
		System.out.println("here is the title page for Ipads    "+printttl(driver));
	}
	public static void clickmac(WebDriver driver) throws InterruptedException {
		Actions ac=new Actions (driver);
		
		ac.moveToElement(findelement(driver,"//a[text()='Product Category']")).build().perform();
		sleep(driver,2);
		findelement(driver,"//a[text()='iMacs']").click();
		sleep(driver,2);
	
	}
	
	

		
	}

