package org.adac.bin;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	protected static WebDriver driver;

	public static WebDriver driverget() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ex-drive\\eclipse-workspace\\Mven\\driver\\chromedriver.exe");
		return driver = new ChromeDriver();
	}

	public static void putUrl(String url) {
		driver.get(url);
	}

	public static void textBox(WebElement l,String value) {
		l.sendKeys(value);
	}

	public static void click(WebElement c) {
		c.click();
	}

	public static void iwait(long g) {
		driver.manage().timeouts().implicitlyWait(g, TimeUnit.SECONDS);

	}

	public static void printUrl() {
		System.out.println(driver.getCurrentUrl());
	}

	public static void printTitle() {
		System.out.println(driver.getTitle());
	}

	public static void printText(WebElement p) {
		System.out.println(p.getText());
	}

	public static void printAttValue(WebElement f, String name) {
		System.out.println(f.getAttribute(name));
	}

	public static void maxScreen() {
		driver.manage().window().maximize();
	}

	public static void oneWinHandle() {
		String onee = driver.getWindowHandle();
		Set<String> second = driver.getWindowHandles();

		for (String n : second) {
			if (!onee.equals(n));
			driver.switchTo().window(n);

		}
	}

	public static void switchFrame(WebElement j) {
		
		driver.switchTo().frame(j);
	}

	public static void accMouse(WebElement r) {
		Actions a = new Actions(driver);
		a.moveToElement(r);
	}
	
	public static void selectBt(WebElement d,int f) {
		Select s=new Select(d);
		s.selectByIndex(f);

	}
	
	public static void forloop(int i) {
		for (i = 0; i < 2; i++) {
			
		}

	}

}
