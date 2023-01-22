package com.Pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

public class BookingConfirmationPojo extends BaseClass {
	public BookingConfirmationPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="order_no")
	private WebElement orderNo;
	public WebElement getOrderNo() {
		return orderNo;
	}
}
