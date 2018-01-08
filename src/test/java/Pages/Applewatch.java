package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.Lib;

public class Applewatch extends Lib {
	
public static void printsearch (WebDriver driver) {
		
//		WebElement printsearch=driver.findElement(By.xpath(".//*[@id='content']"));
//		another way of printing it is written below
//		System.out.println("the error message is   "+driver.findElement(By.xpath(".//*[@id='content']")).getText());
		WebElement printsearch=findelement(driver, ".//*[@id='content']");
		System.out.println("here is text     "+printsearch.getText());
		
	}
}
