package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Util.Lib;


public class ProductCA extends Lib{

	public static void printtitle2(WebDriver driver) {
		System.out.println("here is title of second page   "+printttl(driver));
	}
	
	public static void headertext(WebDriver driver) {
//		WebElement headertext=driver.findElement(By.xpath(".//*[@id='post-64']/header/h1"));
		WebElement headertext=findelement(driver,".//*[@id='post-64']/header/h1" );
		System.out.println("Here is the text written in the header    "+headertext.getText());
	}
	public static void firstproduct(WebDriver driver) {
//		WebElement firstproduct=driver.findElement(By.xpath(".//*[@id='default_products_page_container']/div[3]/div[2]/h2/a"));
		WebElement firstproduct=findelement(driver,".//*[@id='default_products_page_container']/div[3]/div[2]/h2/a" );
		System.out.println("Here is the text written in the header    "+firstproduct.getText());
	}
	
	public static void clickipads(WebDriver driver) throws InterruptedException {
		Actions ac=new Actions (driver);
		
		ac.moveToElement(findelement(driver, "//a[text()='Product Category']")).build().perform();
		sleep(driver,2);
		findelement(driver,"//a[text()='iPads']").click();
		sleep(driver,2);
	
		
//	public static void clickallprod(WebDriver driver) throws InterruptedException {
//		WebElement AllProd=driver.findElement(By.xpath(".//*[@id='menu-item-72']/a"));
//		
//		AllProd.click();
//		Thread.sleep(2000);
	}
}
