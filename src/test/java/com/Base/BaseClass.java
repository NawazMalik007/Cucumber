package com.Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	
	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}
	public void maxWindow() {
		driver.manage().window().maximize();

	}
	public void launchUrl(String url) {
		driver.get(url);

	}
	public void implictWait(int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
	
	public void type(WebElement element,String data) {
		element.sendKeys(data);		
	}
	public void btnClick(WebElement element) {
		element.click();

	}
	public String getTitle() {
		return driver.getTitle();

	}
	public String textMessage(WebElement element) {
		return element.getText();

	}
	public String getAttri(WebElement element) {
		return element.getAttribute("value");

	}
	public String currentUrl() {
		return driver.getCurrentUrl();

	}
	public void selectVisibleText(WebElement element, String data) {
		Select vt =new Select(element);
		vt.selectByVisibleText(data);

	}
	public void selectValue(WebElement element, String data) {
		Select v = new Select(element);
		v.selectByValue(data);
	}
	public void selectIndex(WebElement element, int index) {
		Select si= new Select(element);
		si.selectByIndex(index);
	}
	public void quitBrowser() {
		driver.quit();

	}
	public void fluentwait(int sec,int pollsec) {
		Wait w = new FluentWait(driver).withTimeout(Duration.ofSeconds(sec)).pollingEvery(Duration.ofSeconds(pollsec)).ignoring(Throwable.class);
		
	}
}
