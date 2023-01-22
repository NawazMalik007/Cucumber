package com.Pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

public class HotelInfoPojo extends BaseClass {
	public HotelInfoPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement select;
	
	@FindBy(id="continue")
	private WebElement continuee;

	public WebElement getSelect() {
		return select;
	}

	public WebElement getContinuee() {
		return continuee;
	}
}
