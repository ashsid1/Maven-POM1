package Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Accessories;
import Pages.AllProduct;
import Pages.Applewatch;
import Pages.Home;
import Pages.Imacs;
import Pages.Ipads;
import Pages.ProductCA;
import Util.Lib;

public class Test extends Lib{
	static WebDriver driver;
	@Before
	public void before() throws InterruptedException {
		System.out.println("this is before class");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ayesha\\eclipse-workspace\\maven3\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://store.demoqa.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@After
	public void after() {
		driver.manage().deleteAllCookies();
		driver.close();
	}
	@org.junit.Test
	public void testing () throws InterruptedException, IOException {
		System.out.println("test");
		try {
		Home hm=new Home();
		hm.myaccount(driver);
		hm.printtitle1(driver);
		hm.clickproca(driver);
		
		
		ProductCA pc=new ProductCA();
		pc.printtitle2(driver);
		pc.firstproduct(driver);
		pc.headertext(driver);
//		pc.clickallprod(driver);
		pc.clickipads(driver);
		
		Ipads ip=new Ipads();
		ip.printtitle4(driver);
		ip.clickmac(driver);
		
		Imacs im=new Imacs();
		im.printtitle5(driver);
		im.clickonacc(driver);
		
		Accessories as=new Accessories();
		as.search(driver);
		
		Applewatch aw=new Applewatch();
		aw.printsearch(driver);
		}catch(Exception e) {
			takescreenshot(driver);
		}
//		AllProduct ap=new AllProduct();
//		ap.printtitle3(driver);
}}
