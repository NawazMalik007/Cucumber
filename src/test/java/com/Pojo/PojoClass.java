package com.Pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

 
public class PojoClass extends BaseClass{

	public PojoClass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement usernamee;
	@FindBy(id="password")
	private WebElement passwordd;
	@FindBy(id="login")
	private WebElement loginn;
	
	public WebElement getUsernamee() {
		return usernamee;
	}
	public WebElement getPasswordd() {
		return passwordd;
	}
	public WebElement getLoginn() {
		return loginn;
	}
	
}
